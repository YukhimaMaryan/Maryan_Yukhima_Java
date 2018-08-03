package hw4;

import java.util.ArrayList;

//    Task description
//    Create class Student that has following fields: name, sex, group, language, year.
//    Student can belong to one of three-four groups, know one to five languages, study 1-4 year. Names are mostly unique. Sex is an enum
//    Constructor should accept all 5 attributes above and set fields.
//    Getters can return values of fields
//
// 1. Create the list of students, at leat 10 in total. The know few langauges, belong to one of three-four groups, study 1-4 year
// 2. Create and return a unique set of languages students know
// 3. Create a list (and output it) of all male students;
// 3. Calculate the dispertion of students by study years
// 4. Build a map: what sudents belong to which group
// 5. Create a set of groups (unique items), students belong to
public class CollectionIteration {

    public class Course {
        private String name;
        private String sex;
        private String group;
        private String language;
        private int year;

        private ArrayList<Course> studentList;

        public String getName() {
            return name;
        }

        public String getSex() {
            return sex;
        }

        public String getGroup() {
            return group;
        }

        public String getLanguage() {
            return language;
        }

        public int getYear() {
            return year;
        }
        //Setters

        public void setName(String name) {
            this.name = name;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public void setYear(int year) {
            this.year = year;
        }

        String printInformation() {
            return name + " " + sex + " " + group + " " + language + " " + year;
        }

        public Course(String name, String sex, String group, String language, int year) {
            this.name = name;
            this.sex = sex;
            this.group = group;
            this.language = language;
            this.year = year;
        }

        // Testing code
        public void main(String[] args) {
            Course oop1 = new Course("Joe Fox", "male", "math", "english", 1);
            Course oop2 = new Course("Ani Rigg", "female", "phys", "german", 2);
            Course oop3 = new Course("Ivan Ivanov", "male", "hist", "ukrainian", 3);
        }
            public void print(){

                    System.out.println(getName() + getSex() + getGroup() + getLanguage()+ getYear());
                }
            }

        }



















