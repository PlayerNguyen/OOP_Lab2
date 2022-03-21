package question03;

import java.util.LinkedList;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();

        personList.add(new Student("Johnny Dang",
                "92 Brook Stress, CA, USA",
                "DB",
                2019,
                12000f
                ));

        personList.add(new Student("Khoa Pubg",
                "345 Austria Highway, CA, USA",
                "DB",
                2012,
                4000f
        ));

        personList.add(new Staff(
                "Vuong Pham",
                "NaN",
                "HCMIU",
                12000F
        ));


        for (Person person : personList) {
            System.out.println(person);
        }
    }

}
