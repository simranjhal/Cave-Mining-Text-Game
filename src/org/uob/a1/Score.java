package org.uob.a1;
import org.uob.a1.Score;

public class Score {
    private double startingScore = 1000.0;
    private double currentScore = 1000.0;
    public double roomsVisited= 0.0;
    public double puzzlesSolved = 0.0;
    private final int PUZZLE_VALUE = 10;

    public Score(double startingScore)
    {
        this.startingScore = startingScore;
    }

    public void visitRoom(String room)
    {
        roomsVisited += 1.0;

        if(room.equals("Lava Area") || room.equals("Nether Portal")){
            puzzlesSolved += 1.0;
        }
        
    }
    public void visitRoom() {
        roomsVisited += 1.0;
    }

    // Add solvePuzzle() method (expected by tests)
    public void solvePuzzle() {
        puzzlesSolved += 1.0;
    }

    public double getScore()
    {
        currentScore = (startingScore - roomsVisited + puzzlesSolved) * PUZZLE_VALUE;
        return(currentScore);
    }
        
}