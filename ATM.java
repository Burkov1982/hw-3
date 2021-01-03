public class ATM{

        public int countBanknotes(int sum){
            int sumBanknotes = 0;
            int secondSum = 0;
            if (sum % 500 >= 0){
                sumBanknotes += sum / 500;
                secondSum += sum % 500;
            }
            if (secondSum % 200 >= 0){
                sumBanknotes += secondSum / 200;
                secondSum = secondSum % 200;
            }
            if (secondSum % 100 >= 0){
                sumBanknotes += secondSum / 100;
                secondSum = secondSum % 100;
            }
            if (secondSum % 50 >= 0){
                sumBanknotes += secondSum / 50;
                secondSum = secondSum % 50;
            }
            if (secondSum % 20 >= 0){
                sumBanknotes += secondSum / 20;
                secondSum = secondSum % 20;
            }
            if (secondSum % 10 >= 0){
                sumBanknotes += secondSum / 10;
                secondSum = secondSum % 10;
            }
            if (secondSum % 5 >= 0){
                sumBanknotes += secondSum / 5;
                secondSum = secondSum % 5;
            }
            if (secondSum % 2 >= 0){
                sumBanknotes += secondSum / 2;
                secondSum = secondSum % 2;
            }
            if (secondSum % 10 == 1){
                sumBanknotes += 1;
            }
            return sumBanknotes;
        }

    }


