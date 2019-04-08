package io.codiying.tenniskata.BackKataTennis;

/**
 * @author Tonys
 * 07/04/2019
 * @project Back-KataTennis
 */
public class Player {

    private int score;


    public Player(){
        this.score = 0;
    }

    public void scorePoint(){
        this.score++;
    }

    public int getScore(){
        return this.score;
    }
    public String returnScore(){
        return ScorePoint.values()[this.score].getScore();
    }

}
