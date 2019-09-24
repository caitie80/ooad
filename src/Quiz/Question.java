package Quiz;

public class Question {
    private String text;
    private String answer;


    public Question() {
        text = "";
        answer = "";
    }

    public void setText(String Text)
    {
        text = Text;
    }

    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }

    public void display()
    {
        System.out.println(text);
    }

    public void setAnswer(String Answer) {
        answer = Answer;
    }
}
