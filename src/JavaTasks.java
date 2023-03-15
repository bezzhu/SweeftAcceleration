import java.util.*;

public class JavaTasks {


    /*
        ამოცანა 1.
            ვიყენებ XOR-ს, ვინაიდან მას აქვს კარგი თვისება.0^a=a და a^a=0.
            გადავუყვები მასივს და singleNumber ცვლადზე ვასრულებ XOR ოპერაციას.
            ორი ერთნაირი რიცხვი ამ ოპერაციისას გააქრობს ერთმანეთ და
            დარჩენბა რიცხვი, რომელიც არ მეორდება მასივში.
            Time complexity - O(n).
            Memory complexity - O(1).
    */
    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        for (int num : nums) {
            singleNumber ^= num;
        }
        return singleNumber;
    }

    /*
        ამოცანა 1.
            ვიყენებ Set-ს ვინაიდან ის ინახავს განსხვავებულ მნიშვნელობებს.
            გადავუყვები მასივს და თითოეულ წევრს ჯერ შევამოწმებ არის თუ
            არა Set-ში. თუ არის წავშლი ამ რიცხვს Set-იდან და თუ არ არის
            დავამატებ Set-ში. ამრიგად ბოლოს დაგვრჩება რიცხვი რომელიც არ
            მეორდება მასივში.
            Time complexity - O(n).
            Memory complexity - O(1).
    */
    public int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }


    /*
        ამოცანა 2.
            ვიყენებ მასივს სადაც კლებადობის მიხედვით ვინახავ მონეტებს.
            შემომაქვს ცვლადი დასახურდავებლად საჭირო მონეტების დასათვლელად.
            გადავუყვები მასვივს და ცვლადს ვუმატებ დასახურდავებელი თანხის
            "განაყოფს" მასივის წევრზე. ვინაიდან int ების გაყოფაა დააბრუნებს
            მთელ მნიშვნელობას მაგ: 178/50=3. შემდეგ ვნაშთავ დასახურდევებელ
            თანხას და თუ ის გაუტოლდება ნულს მაშინ დაბრუნდება მონეტების რაოდენობას.
            Time complexity - O(1).
            Memory complexity - O(1).
        */
    public int minSplit(int amount) {
        int[] coins = {50, 20, 10, 5, 1};
        int coinCount = 0;
        for (int coin : coins) {
            coinCount += amount / coin;
            amount %= coin;
            if (amount == 0) {
                break;
            }
        }
        return coinCount;
    }

    /*
        ამოცანა 3.
            ვასორტირებ მასივს.
            ცვლადში ვინახავ მინიმალურ დადებით რიცხვს 1-ს და
            ვადარებ მასივის ყველა წევრს. თუ რომელიმეს გაუტოლდა
            ცვლადს ვზრდი ერთით. ვინაიდან ისეთ რიცხვს ვეძებთ,
            რომელიც ამ მასივში არ არის.
            Time complexity - O(n*Log(n)).
            Memory complexity - O(1).
        */

    public int notContains(int[] array) {
        Arrays.sort(array);
        int minNum = 1;
        for (int num : array) {
            if (num == minNum) {
                minNum++;
            }else if(num > minNum) return minNum;
        }
        return minNum;
    }
    /*
        ამოცანა 4.
            თავდაპირველად ვაშორებ სტრინგებს ნულებს,რომლებიც
            სადაწყისში უწერია (თუ არის ასეთი შემთხვევა).
            შეკრებას ვიწყებ თითოეული რიცხვის მარჯვენა ბოლოდან და
            ვამატებთ შექმნი ცვლადს carry. მიღებულ მნიშვნელობას
            დანაშთლს 2-ზე ვამატებთ სტრინგში.
            ასე გადმოვუყვებით მარცხნივ მანამ სანამ არ გავივლით ყველა
            ციფრს ორივე რიცხვში.თუ ცვლადი გაუტოლდა 1-ს
            ყველა დამატების შემდეგ ამ რიცხვს ვამატებთ სტრინგს.
            საბოლოოდ შედგენილ სტრინგს ვაბრუნებთ და ვიღებთ ორი
            ბინარული სტრინგის შეკრებას.
            Time complexity - O(n).
            Memory complexity - O(n).
        */

    public String addBinary(String a, String b) {
        String A = removeLeadingZeros(a);
        String B = removeLeadingZeros(b);
        StringBuilder stringBuilder = new StringBuilder();
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += A.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += B.charAt(j--) - '0';
            }
            stringBuilder.append(carry % 2);
            carry /= 2;
        }
        return stringBuilder.reverse().toString();
    }
    private static String removeLeadingZeros(String binaryString) {
        int index = 0;
        while (index < binaryString.length() - 1 && binaryString.charAt(index) == '0') {
            index++;
        }
        return binaryString.substring(index);
    }
    /*
        ამოცანა 5.
            თავდაპირველად ვამოწმებ კიბეების რაოდენობა თუ არის 1 ან 2.
            ამშემთხვევაში კოდი პირდაპირ დააბრუნებს კიბეების რაოდენობას
            ვინაიდან ვარიანტების რაოდენობას ემთხვევა.
            ვიყენებ "Dynamic Programming"-ს, თითეულ ნაბიჯს ვინახავ
            მასივში სადაც თავდაპირველად გვექნება 1 და 2.
            ყოველი მომდევნო ნაბიჯი ემთხვევა ფიბონაჩის
            მიმდევრობას და იქნება წინა ორის ჯამის ტოლი.
            მასივის ბოლოს კი მივიღებთ ჩვენს საძიებელ რიცხვს.
        */

    public int countVariants(int stairsCount) {
        if (stairsCount <=2) return stairsCount;

        int[] steps = new int[stairsCount + 1];

        steps[0] = 1;
        steps[1] = 2;

        for (int i = 2; i < stairsCount; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }

        return steps[stairsCount - 1];
    }

    /*
        ამოცანა 5.
            რეკურსიულად
            Time complexity - O(2^n).
            Memory complexity - O(1).
     */
    public int countVariants2(int stairsCount) {
        if (stairsCount <= 2) {
            return stairsCount;
        }
        return countVariants2(stairsCount - 1) + countVariants2(stairsCount - 2);
    }

    /*
        ამოცანა 5.
            მემორიზაციით
            Time complexity - O(n).
            Memory complexity - O(n).
     */
    int[] memo = new int[10000];

    public int countVariants3(int stairsCount) {
        return countVariantsMemo(stairsCount, memo);
    }

    private int countVariantsMemo(int stairsCount, int[] memo) {
        if (stairsCount <= 2) {
            return stairsCount;
        }
        if (memo[stairsCount] != 0) {
            return memo[stairsCount];
        }
        memo[stairsCount] = countVariantsMemo(stairsCount - 1, memo) + countVariantsMemo(stairsCount - 2, memo);
        return memo[stairsCount];
    }


}
