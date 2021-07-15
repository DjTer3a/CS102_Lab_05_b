/**
 * Lab_05_b Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 16/07/2021
 */


package cs102;


public class HangmanModel extends Hangman{

    IHangmanView view;


    /**
     * constructor for hangman
     */
    public HangmanModel(IHangmanSetup setup) {
        super(setup);
    }


    /**
     * @return void method to add a view
     */
    public void addView(IHangmanView view){
        this.view = view;
        update();
    }


    /**
     * @return void method to update the view
     */
    public void update(){
        view.updateView(this);
    }


    /**
     * @Overrides the tryThis method
     */
    @Override
    public int tryThis(char letter){
        int tryThis = super.tryThis(letter);
        update();
        return tryThis;
    }


    /**
     * @Overrides the initNewGame method
     */
    @Override
    public void initNewGame(){
        super.initNewGame();
    }
}