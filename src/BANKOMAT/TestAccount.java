package BANKOMAT;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAccount {

    public static ArrayList<Account> listeRacuna = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int runApp = 0;


        System.out.println("Dobrodosli u BANKOMAT aplikaciju! ");

        System.out.println("Ako zelite da kreirate racun unesite (1), "
                + " ako zelite izvrsiti transakciju unesite (2), "
                + " ako zelite napustiti aplikaciju unesite (0). ");

        runApp = input.nextInt();

        while (runApp != 0) {
            while (runApp == 1) {
                int brojAkonta = 0;
                String imeRacuna = "";
                double iznosNaRacunu = -1;
                boolean valid = false;
                Account acc = new Account();

                while (!valid) {
                    System.out.println("Molimo vas da unesete broj racuna: ");
                    brojAkonta = input.nextInt();
                    if ((acc.jednakBroj(brojAkonta)) || (acc.jeNegativan(brojAkonta))) {
                        continue;
                    }
                    valid = true;
                }
                while (iznosNaRacunu < 0) {
                    System.out.println("Molimo vas da unesete iznos na racunu: ");
                    iznosNaRacunu = input.nextDouble();
                    if (acc.jeNegativan(iznosNaRacunu)) {
                        continue;
                    }
                }
                imeRacuna = unesiIme();

                acc.setBrojRacuna(brojAkonta);
                acc.setImeVlasnika(imeRacuna);
                acc.setStanjeNaRacunu(iznosNaRacunu);

                listeRacuna.add(acc);

                System.out.println("Lista racuna: ");
                for (Account account : listeRacuna) {
                    System.out.println(account.toString());
                }
                System.out.println();
                System.out.println("Ako zelite da kreirate racun unesite (1), "
                        + " ako zelite izvrsiti transakciju unesite (2), "
                        + " ako zelite napustiti aplikaciju unesite (0). ");

                runApp = input.nextInt();
            }
            while (runApp == 2) {

                int source = 0;
                int target = 0;
                boolean validSourceAcc = false;
                boolean validTargetAcc = false;
                double transferNovca = 0;

                while (!validSourceAcc) {
                    System.out.println("Molimo unesite broj racuna sa kojeg prebacujete novac. ");
                    source = input.nextInt();

                    if (racunPostoji(source)) {
                        System.out.println("Molimo unesite iznos novca za transakciju. ");
                        transferNovca = input.nextDouble();
                        if (dovoljnoNovca(source, transferNovca)) {
                            validSourceAcc = true;
                        } else {
                            System.out.println("Na racunu ' " + source + " ' nema dovoljno sredstava.");
                        }
                    } else {
                        System.out.println("Broj racuna " + source + " nije validan. Pokusajte ponovo.");
                    }

                }
                while (!validTargetAcc) {
                    System.out.println("Molimo unesite broj racuna na koji se prebacuju sredstva.");
                    target = input.nextInt();

                    if (racunPostoji(target)) {
                        transakcija(source, target, transferNovca);
                        validTargetAcc = true;

                    } else {
                        System.out.println("Broj racuna " + target + " nije validan. Pokusajte ponovo.");
                    }
                }
                System.out.println("Stanje Racuna nakon transakcije: ");
                for (Account account : listeRacuna) {
                    System.out.println(account.toString());
                }
                System.out.println();
                System.out.println("Ako zelite da kreirate racun unesite (1), "
                        + " ako zelite izvrsiti transakciju unesite (2), "
                        + " ako zelite napustiti aplikaciju unesite (0). ");

                runApp = input.nextInt();
            }


        }


    }

    private static void transakcija(int source, int target, double transferNovca) {
        int sourceIndex = getIndex(source);
        int targetIndex = getIndex(target);

        double noviIznosSource = listeRacuna.get(sourceIndex).getStanjeNaRacunu() - transferNovca;
        listeRacuna.get(sourceIndex).setStanjeNaRacunu(noviIznosSource);

        double noviIznosTarget = listeRacuna.get(targetIndex).getStanjeNaRacunu() + transferNovca;
        listeRacuna.get(targetIndex).setStanjeNaRacunu(noviIznosTarget);
    }

    private static Integer getIndex(int source) {
        for (int i = 0; i < listeRacuna.size(); i++) {
            if (listeRacuna.get(i).getBrojRacuna() == source) {
                return i;
            }
        }
        return null;
    }

    private static boolean dovoljnoNovca(int broj, double trasferNovca) {
        for (Account account : listeRacuna) {
            if (account.getBrojRacuna() == broj) {
                if (account.getStanjeNaRacunu() < trasferNovca) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean racunPostoji(int broj) {
        for (Account account : listeRacuna) {
            if (account.getBrojRacuna() == broj) {
                return true;
            }
        }
        return false;
    }

    private static String unesiIme() {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite ime korsinika: ");
        String ime = input.nextLine();
        return ime;
    }


}
