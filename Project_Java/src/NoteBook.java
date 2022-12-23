
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.*;

public class NoteBook {
    ArrayList<Objective> objectives;
    int id_counter;
    Scanner scanner;

    NoteBook() {
        this.objectives = new ArrayList<>();
        this.id_counter = 0;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Добро пожаловать в планировщик дел! В этой программе вы можете управлять своими задачами.");
            System.out.println("Ниже представлены способы взаимодействия с вашими задачами. Для выбора действия, введите соответствующую цифру:");
            System.out.println("1 - Создать задание");
            System.out.println("2 - Удалить задание");
            System.out.println("3 - Отредактировать задание");
            System.out.println("4 - Выполнить задание (в настоящий момент времени)");
            System.out.println("5 - Просмотреть детальную информацию о задании");
            System.out.println("6 - Просмотреть список ВСЕХ заданий");
            System.out.println("7 - Просмотреть список ВЫПОЛНЕННЫХ заданий");
            System.out.println("8 - Просмотреть список НЕВЫПОЛНЕННЫХ заданий");
            System.out.println("9 - Просмотреть список ВСЕХ заданий по ДАТЕ");
            System.out.println("10 - Просмотреть список ВЫПОЛНЕННЫХ заданий по ДАТЕ");
            System.out.println("11 - Просмотреть список НЕВЫПОЛНЕННЫХ заданий по ДАТЕ");
            System.out.println("0 - Выход");

            switch (this.scanner.nextLine()) {
                case "1": {
                    System.out.println("//////////////////////////////////////////////////////");
                    this.CreateObjective();
                    break;
                }
                case "2": {
                    System.out.println("//////////////////////////////////////////////////////");
                    int objectiveUid = this.GetObjective();
                    if (objectiveUid != 0) {
                        this.DeleteObjective(objectiveUid);
                    }
                    break;
                }
                case "3": {
                    System.out.println("//////////////////////////////////////////////////////");
                    int ObjectiveUid = this.GetObjective();
                    if (ObjectiveUid != 0) {
                        this.CorrectObjective(ObjectiveUid);
                    }
                    break;
                }
                case "4": {
                    System.out.println("//////////////////////////////////////////////////////");
                    int ObjectiveUid = this.GetObjective();
                    if (ObjectiveUid != 0) {
                        this.CompleteObjective(ObjectiveUid);
                    }
                    break;
                }
                case "5": {
                    System.out.println("//////////////////////////////////////////////////////");
                    int ObjectiveUid = this.GetObjective();
                    if (ObjectiveUid != 0) {
                        this.ShowObjectivesDetailInformation(ObjectiveUid);
                    }
                    break;
                }
                case "6": {
                    System.out.println("//////////////////////////////////////////////////////");
                    this.ShowAllObjective();
                    break;
                }
                case "7": {
                    System.out.println("//////////////////////////////////////////////////////");
                    this.ShowCompletedObjectives();
                    break;
                }
                case "8": {
                    System.out.println("//////////////////////////////////////////////////////");
                    this.ShowNotCompletedObjectives();
                    break;
                }
                case "9": {
                    System.out.println("//////////////////////////////////////////////////////");
                    Date date = this.GetDate();
                    this.ShowAllObjective(date);
                    break;
                }
                case "10": {
                    System.out.println("//////////////////////////////////////////////////////");
                    Date date = this.GetDate();
                    this.ShowCompletedObjectives(date);
                    break;
                }
                case "11": {
                    System.out.println("//////////////////////////////////////////////////////");
                    Date date = this.GetDate();
                    this.ShowNotCompletedObjectives(date);
                    break;
                }

                case "0": {
                    return;
                }
                default: {
                    System.out.println("Вы ввели неверную цифру");
                    break;
                }
            }
        }
    }


    public void CreateObjective() {
        System.out.println("Введите название задания:");
        String title = this.scanner.nextLine();
        System.out.println("Введите описание задания:");
        String description = this.scanner.nextLine();
        System.out.println("Введите событие, к которому относится задание:");
        String event = this.scanner.nextLine();
        System.out.println("Введите уровень важности задания:");
        String importance = this.scanner.nextLine();
        this.objectives.add(new Objective(this.id_counter++, title, description, event, importance));
        System.out.println("Задание добавлено");
    }

    public void CompleteObjective(int ObjectiveUid) {
        int task_index = this.GetObjectiveById(ObjectiveUid);
        this.objectives.get(task_index).completed = new Date();
    }

    public void CorrectObjective(int ObjectiveUid) {
        Objective obj = this.objectives.get(this.GetObjectiveById(ObjectiveUid));
        System.out.println("Что хотите изменить?");
        System.out.println("1 - Заголовок");
        System.out.println("2 - Описание");
        System.out.println("3 - Событие");
        System.out.println("4 - Уровень важности");
        System.out.println("0 - Выход из редактирования");
        switch (this.scanner.nextLine()) {
            case "1": {
                System.out.println("Введите заголовок");
                obj.header = this.scanner.nextLine();
            }
            case "2": {
                System.out.println("Введите описание");
                obj.description = this.scanner.nextLine();
            }
            case "3": {
                System.out.println("Введите событие");
                obj.event = this.scanner.nextLine();
            }
            case "4": {
                System.out.println("Введите уровень важности");
                obj.importans = this.scanner.nextLine();
            }
            case "0": {
                System.out.println("Выход из редактирования");
            }
            default: {
                System.out.println("Вы ввели неверную цифру");
            }
        }
    }


    private Date GetDate() {
        System.out.println("Введите дату (MMMM d, yyyy) ((December 23, 2022)):");
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        String input = scanner.nextLine();
        try {
            return format.parse(input);
        } catch (ParseException pe) {
            System.out.println("Неверный ввод");
            return new Date();
        }
    }

    private int GetObjective() {
        System.out.println("Введите номер задания");
        try {
            return Integer.parseInt(this.scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Неверный ввод номера задания");
        }
        return 0;
    }



    private int GetObjectiveById(int ObjectiveUid) {
        for (int i = 0; i < this.objectives.size(); i++) {
            if (Objects.equals(this.objectives.get(i).number, ObjectiveUid)) {
                return i;
            }
        }
        return 0;
    }



    public void ShowObjectivesDetailInformation(int ObjectiveUid) {
        Objective obj = this.objectives.get(this.GetObjectiveById(ObjectiveUid));
        System.out.println("Заголовок:");
        System.out.println(obj.header);
        System.out.println("Описание:");
        System.out.println(obj.description);
        System.out.println("Дата создания:");
        System.out.println(obj.created);
        System.out.println("Дата выполнения:");
        System.out.println(obj.completed);
        System.out.println("Событие:");
        System.out.println(obj.event);
        System.out.println("Важность:");
        System.out.println(obj.importans);
    }

    public void ShowAllObjective() {
        System.out.println("Все задания:");
        for (Objective obj : this.objectives) {
            System.out.println("Номер для поиска "+obj.number + " Заголовок: " + obj.header);
        }
    }

    public void ShowAllObjective(Date date) {
        System.out.println("Все задания по дате " + date + ":");
        for (Objective obj : this.objectives) {
            if (obj.created.getDate() == date.getDate()) {
                System.out.println("Номер для поиска "+obj.number + " Заголовок: " + obj.header);
            }
        }
    }


    public void ShowCompletedObjectives() {
        System.out.println("Выполненные задания:");
        for (Objective obj : this.objectives) {
            if (obj.completed != null) {
                System.out.println("Заголовок: " + obj.header);
            }
        }
    }

    public void ShowCompletedObjectives(Date date) {
        System.out.println("Выполненные задания по дате " + date + ":");
        for (Objective obj : this.objectives) {
            if (obj.completed != null) {
                if (obj.created.getDate() == date.getDate()) {
                    System.out.println("Заголовок: " + obj.header);
                }
            }
        }
    }

    public void ShowNotCompletedObjectives() {
        System.out.println("Невыполненные задания:");
        for (Objective obj : this.objectives) {
            if (obj.completed == null) {
                System.out.println("Заголовок: " + obj.header);
            }
        }
    }


    public void ShowNotCompletedObjectives(Date date) {
        System.out.println("Невыполненные задания по дате " + date + ":");
        for (Objective obj : this.objectives) {
            if (obj.completed == null) {
                if (obj.created.getDate() == date.getDate()) {
                    System.out.println("Заголовок: " + obj.header);
                }
            }
        }
    }


    public void DeleteObjective(int ObjectiveUid) {
        this.objectives.remove(this.GetObjectiveById(ObjectiveUid));
    }


}