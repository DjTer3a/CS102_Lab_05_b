package cs102;



public class HangmanModel extends Hangman{

    IHangmanView view;


    public HangmanModel(IHangmanSetup setup) {
        super(setup);
    }

    public void addView(IHangmanView view){
        this.view = view;
        update();
    }

    public void update(){
        view.updateView(this);
    }

    @Override
    public int tryThis(char letter){
        int tryThis = super.tryThis(letter);
        update();
        return tryThis;
    }

    @Override
    public void initNewGame(){
        super.initNewGame();
    }
}