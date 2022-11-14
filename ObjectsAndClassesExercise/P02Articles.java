package ObjectsAndClassesExercise;

import java.util.List;
import java.util.Scanner;

public class P02Articles {
    public static class Article {
        private String title;
        private String content;
        private String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String toString(){
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(", ");
        Article article = new Article(input[0],input[1],input[2]);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            String temp = command[1];
            if (command[0].contains("Edit")){
                article.setContent(command[1]);
            } else if (command[0].contains("ChangeAuthor")) {
                article.setAuthor(command[1]);
            } else if (command[0].contains("Rename")){
                article.setTitle(command[1]);
            }

        }
        System.out.println(article.toString());
    }
}
