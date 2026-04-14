import java.util.*;

class Question {
    String question;
    String a, b, c, d;
    char correctAnswer;

    Question(String question, String a, String b, String c, String d, char correctAnswer) {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.correctAnswer = correctAnswer;
    }
    // Display 
    void display() {
        System.out.println("\n" + question);
        System.out.println("A. " + a);
        System.out.println("B. " + b);
        System.out.println("C. " + c);
        System.out.println("D. " + d);
    }
}

class Quiz {
    ArrayList<Question> questions = new ArrayList<>();
    int score = 0;

    void addQuest(Question q) {
        questions.add(q);
    }

    void startQuiz() {
        Scanner sc = new Scanner(System.in);
        for (Question q : questions) {
            q.display();
            System.out.print("Enter your answer (A/B/C/D): ");
            char ans = sc.next().toUpperCase().charAt(0);

            if (ans == q.correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + q.correctAnswer);
            }
        }
        System.out.println("\nYour final score: " + score + "/" + questions.size());
        sc.close();
    }
}


public class OnlineQuizSystem {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        quiz.addQuest(new Question(
                "What is the capital of India?",
                "Mumbai", "Delhi", "Chennai", "Kolkata", 'B'));

        quiz.addQuest(new Question(
                "Which language is used for Android development?",
                "Python", "Java", "C++", "Swift", 'B'));

        quiz.addQuest(new Question(
                "What are the principles of Object-Oriented Programming (OOP)",
                "Encapsulation", "Inheritance", "Polymorphism", "All of the above", 'D'));

        quiz.addQuest(new Question(
                "How many elements are in the periodic table?",
                "118", "112", "150", "200", 'A'));
        
        quiz.addQuest(new Question(
                "What is the purpose of a firewall? ",
                "To block all incoming traffic", "To monitor network traffic", "To prevent unauthorized access", "To encrypt data transmission", 'C'));

        quiz.addQuest(new Question(
                "What does VPN stand for?",
                "Virtual Private Network", "Visual Programming Language", "Visible Programming Interface", "Volatile Program Memory", 'A'));

        quiz.startQuiz();
    }
}