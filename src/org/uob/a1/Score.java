package org.uob.a1;
import org.uob.a1.Score;

public class Score {
    private double startingScore;
    private double currentScore;
    public double roomsVisited;
    public double puzzlesSolved;
    private final int PUZZLE_VALUE = 10;

    public Score() //inital constructor class
    {
        this.startingScore = 1000.0;
        this.currentScore = startingScore;
        this.roomsVisited = 0.0;
        this.puzzlesSolved = 0.0;
    }

    public Score(double startingScore) { //constructor class to take a value 
        this.startingScore = startingScore;
        this.currentScore = startingScore;
        this.roomsVisited = 0;
        this.puzzlesSolved = 0;
    }

    public void visitRoom() //updates when called upon in one of the room classes
    {
        roomsVisited += 1.0;
        
    }
    public void visitRoom(String room) {
        visitRoom();
    }

    public void solvePuzzle() { //increments in either Lava Area or NetherHold once the puzzles has been successfully solved
        puzzlesSolved += 1.0;
    }

    public double getScore() //displays the score
    {
        currentScore = startingScore - (roomsVisited * PUZZLE_VALUE) + (puzzlesSolved * PUZZLE_VALUE);
        return(currentScore);
    }
        
}