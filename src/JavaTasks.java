import java.util.HashSet;
import java.util.Set;

public class JavaTasks {

    /*
        ამოცანა 1.
            ვიყენებ XOR-ს, ვინაიდან მას აქვს კარგი თვისება.0^a=a და a^a=0.
            გადავუყვები მასივს და singleNumber ცვლადზე ვასრულებ XOR ოპერაციას.
            ორი ერთნაირი რიცხვი ამ ოპერაციისას გააქრობს ერთმანეთ და
            დარჩენბა რიცხვი, რომელიც არ მეორდება მასივში.
    */
    public int singleNumber(int[] nums){
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


}
