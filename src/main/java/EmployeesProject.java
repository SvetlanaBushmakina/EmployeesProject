public class EmployeesProject {
    public static void main(String[] args) {

        final int numberOfProgrammers = 8;
        System.out.println("Количество прогаммистов на проекте: " + numberOfProgrammers);

        final int numberOfTestersPerProgrammer = 2;
        System.out.println("Количество тестировщиков на одного программиста: " + numberOfTestersPerProgrammer);

        final int numberOfSupportsPerProgrammer = 3;
        System.out.println("Количество специалистов поддержки, необходимое, чтобы обработать вопросы по коду, напасанного одним программистом: " + numberOfSupportsPerProgrammer);

        final int allTesters = numberOfProgrammers * numberOfTestersPerProgrammer;
        System.out.println("Количество всех тестировщиков на проекте: " + allTesters);

        final int allSupports = numberOfProgrammers * numberOfSupportsPerProgrammer;
        System.out.println("Количество всех специалистов техподдержки на проекте: " + allSupports);

        final int allEmployees = numberOfProgrammers + allTesters + allSupports;
        System.out.println("Количество всех сотрудников на проекте: " + allEmployees);

    }
}
