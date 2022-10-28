import java.util.*;

public class Main {
    public static Random rnd = new Random();

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }


    public static void AddingMiilon(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(rnd.nextInt(10000));
            linkedList.add(rnd.nextInt(10000));
        }
    }

    public static void ElemetOneHunderThousandTimes(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 100000; i++) {
            arrayList.get(rnd.nextInt(arrayList.size()));
        }
    }

    public static void main(String[] args) {


        System.out.println("Задание 1");
        Integer[][] nums = {{1, 3, 5, 12}, {3, 5, 2, 16}, {5, 6, 2, 12}};
        IterHandMade<Integer> Iterators = new IterHandMade<>(nums);
        while (Iterators.hasNext()) {
            System.out.println(Iterators.next());
        }

        System.out.println("Задание 2");
        IterHandMade<Integer> Iterators2 = new IterHandMade<>(nums);
        IterHandMade<Integer> Iterators3 = new IterHandMade<>(nums);
        OverCustomIter<Integer> overCustomIter = new OverCustomIter<>(Iterators2, Iterators3);
        while (overCustomIter.hasNext()) {
            System.out.println(overCustomIter.next());
        }

        System.out.println("Задание 4");
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        Iterator<String> stringIterator = stringArrayList.iterator();
        FlatIter flatIter = new FlatIter(stringIterator);
        while (flatIter.hasNext()) {
            System.out.println(flatIter.next());
        }

        System.out.println("Задание 5");
        Collection<String> CollcectionsOfStringData = new ArrayList<>();
        CollcectionsOfStringData.add("qwe");
        CollcectionsOfStringData.add("qwe");
        CollcectionsOfStringData.add("yyy");
        CollcectionsOfStringData.add("yyy");
        System.out.println(CollcectionsOfStringData);
        CollcectionsOfStringData = removeDuplicates(CollcectionsOfStringData);
        System.out.println(CollcectionsOfStringData);


        System.out.println("Задание 6");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        System.out.println("Добавление миллиона");
        AddingMiilon(integerArrayList, integerLinkedList);
        System.out.println("Добавление миллиона конец");
        ArrayList<Integer> integerArrayList2 = new ArrayList<>();
        integerArrayList2.add(1);
        integerArrayList2.add(2);
        integerArrayList2.add(3);
        System.out.println("Случайный выбор сто тысяч раз");
        ElemetOneHunderThousandTimes(integerArrayList2);
        System.out.println("Случайный выбор сто тысяч раз конец");
        System.out.println("Быстрее добавить миллион");

        System.out.println("Задание 7");
        FrequencyDictionary fd = new FrequencyDictionary();
        fd.analyze("раз раз раз два три");
        System.out.println(fd.getDictionary());

        // Задание 8
        System.out.println("Задание 8");
        RegularCard regularCard = new RegularCard(11111111);
        SchoolCard schoolCard = new SchoolCard(22222222);
        StudentCard studentCard = new StudentCard(33333333);
        CashMachine.addMoneySocialCard(schoolCard, 200);
        CashMachine.addMoneyRegularCard(regularCard, 400);
        MobileCashMachine.addMoneySocialCard(studentCard, 600);
        System.out.println(schoolCard.isActive);
        System.out.println(studentCard.isActive);
        Terminal term = new Terminal();
        term.checkIn(regularCard);
        term.checkIn(schoolCard);
        term.checkIn(studentCard);
        term.getStat();


    }
}