
/*1.CREATE QUESTION:store questions and answers.
 * DISPLAY QUESTION:display the question to the user.
 * GET USER INPUT:allow the user to input the answer.
 * CHECK ANSWER:compare the user's answer with the correct answer.
 * TRACK SCORE:keep track of the user's score.
 * REPEAT:continue displaying new questions until the quiz ends.
 * END GAME:display final score.
 */
import java.util.Scanner;

 class ArrayQuestions{
    int score=0;

// General Knowledge Questions and Answers
        String[] generalKnowledgeQuestions = {
            "Which planet is known as the \"Red Planet\"?",
            "What is the capital of Australia?",
            "Who painted the Mona Lisa?",
            "What is the largest mammal in the world?",
            "In which year did World War I begin?"
        };
        
        String[] generalKnowledgeAnswers = {
            "Mars",
            "Canberra",
            "Leonardo da Vinci",
            "Blue whale",
            "1914"
        };
 
        public void method()
           {
            Scanner var=new Scanner(System.in);
            int score=0;
            int i;

            for(i=0;i<generalKnowledgeQuestions.length;i++){
            System.out.println("Question : "+generalKnowledgeQuestions[i]);
            System.out.print("Answer :");
            String useranswer=var.nextLine();
            if(useranswer.equalsIgnoreCase(generalKnowledgeAnswers[i])){
                System.out.println("Correct answer");
                score++;
            }else{
                System.out.println("Wrong answer ");
                
            }
            }
            System.out.println("Total score is:"+score);
            var.close();
        }
 }



public class TriviaQuiz {
    public static void main(String[] args){

        ArrayQuestions obj=new ArrayQuestions();
        System.out.println("-------------------------------------------------------");
        System.out.println("-----------  WELCOME TO TRIVIA QUIZ GAME  -------------");
        System.out.println("-------------------------------------------------------");
        obj.method();
        
    }
    
}
