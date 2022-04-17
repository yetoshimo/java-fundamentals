package EB_lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class softuniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> courses = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("course start")) {
            String command = nextCommand.split(":")[0];
            String lessonTitle = nextCommand.split(":")[1];

            switch (command) {
                case "Add":
                    if (!courses.contains(lessonTitle)) {
                        courses.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int lessonIndex = Integer.parseInt(nextCommand.split(":")[2]);
                    if (!courses.contains(lessonTitle)) {
                        courses.add(lessonIndex, lessonTitle);
                    }
                    break;
                case "Remove":
                    courses.remove(lessonTitle);
                    courses.remove(lessonTitle + "-Exercise");
                    break;
                case "Swap":
                    String otherLessonTitle = nextCommand.split(":")[2];
                    if (courses.contains(lessonTitle) && courses.contains(otherLessonTitle)) {
                        int firstLessonIndex = courses.indexOf(lessonTitle);
                        int secondLessonIndex = courses.indexOf(otherLessonTitle);
                        courses.add(secondLessonIndex, lessonTitle);
                        courses.remove(otherLessonTitle);
                        courses.remove(firstLessonIndex);
                        courses.add(firstLessonIndex, otherLessonTitle);

                        if (courses.contains(otherLessonTitle + "-Exercise")) {
                            courses.remove((Object) otherLessonTitle + "-Exercise");
                            courses.add(courses.indexOf(otherLessonTitle) + 1, otherLessonTitle + "-Exercise");
                        }

                        if (courses.contains(lessonTitle + "-Exercise")) {
                            courses.remove((Object) lessonTitle + "-Exercise");
                            courses.add(courses.indexOf(lessonTitle) + 1, lessonTitle + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    if (courses.contains(lessonTitle) && !courses.contains(lessonTitle + "-Exercise")) {
                        int exerciseIndex = courses.indexOf(lessonTitle) + 1;
                        courses.add(exerciseIndex, lessonTitle + "-Exercise");
                    } else if (!courses.contains(lessonTitle + "-Exercise")) {
                        courses.add(lessonTitle);
                        courses.add(lessonTitle + "-Exercise");
                    }
            }
            nextCommand = scan.nextLine();
        }
        for (String j: courses) {
            System.out.printf("%d.%s%n", courses.indexOf(j) + 1, j);
        }
    }
}
