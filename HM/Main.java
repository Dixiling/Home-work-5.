package HM;
/*Создать класс учебная группа, содержащий в себе поля преподаватель и список Студентов.
* Создать класс учебная/группа-сервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>))
* формирования из студентов и преподавателя учебной группы и возвращения его.
* Создать метод в контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id)
* и формирования учебной группы, путём вызова метода из сервиса.
* Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.
*/

import HM.controller.Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Controller Controller = new Controller();

        Controller.createTeacher("Яков", "Иоан", "Святослав");
        Controller.createTeacher("Каловников", "Алексей", "Викторович");
        Controller.createStudent("Сковник", "Константин", "Антонович");
        Controller.createStudent("Крыжовникова", "Анастасия", "Светлановна");
        Controller.createStudent("Дурасова", "Татьяна", "Михайловна");
        Controller.createStudent("Ельин", "Мразь", "Гадковович");
        Controller.createStudent("Матвеев", "Сергей", "Георгиевич");
        Controller.createStudent("Тихонов", "Максим", "Миронович");
        Controller.createStudent("Клин", "Жуков", "Александрович");

        Controller.printGroupLearn(Controller.createGroupLearn(1, 3, 5, 6, 7));
    
        System.out.println();
    }
}