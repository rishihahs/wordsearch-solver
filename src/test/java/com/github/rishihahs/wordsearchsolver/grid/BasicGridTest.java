package com.github.rishihahs.wordsearchsolver.grid;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BasicGridTest {
    
    /*
    From whenwewordsearch.com's very difficult word searches
    <http://www.whenwewordsearch.com/word_search_puzzles/difficult_word_searches.jsp>
    */
    private static final String[][] GRID = {
        { "N", "E", "W", "M", "E", "X", "I", "C", "O", "O", "S", "A", "K", "S", "A", "R", "B", "E", "N", "H", "E", "F", "Y" },
        { "A", "S", "U", "C", "Y", "W", "E", "S", "T", "V", "I", "R", "G", "I", "N", "I", "A", "M", "L", "F", "T", "Q", "I" },
        { "S", "E", "O", "H", "A", "D", "I", "M", "J", "C", "P", "E", "N", "N", "S", "Y", "L", "V", "A", "N", "I", "A", "B" },
        { "H", "S", "A", "S", "N", "A", "K", "I", "L", "I", "O", "M", "A", "I", "N", "E", "W", "Y", "O", "M", "I", "N", "G" },
        { "V", "H", "I", "K", "R", "N", "Y", "S", "P", "H", "V", "N", "O", "O", "D", "A", "R", "O", "L", "O", "C", "T", "D" },
        { "H", "M", "T", "R", "S", "I", "E", "S", "M", "X", "Y", "O", "N", "S", "H", "J", "G", "Y", "A", "A", "R", "E", "H" },
        { "I", "I", "W", "O", "O", "L", "S", "I", "O", "P", "K", "I", "O", "E", "R", "F", "V", "I", "I", "B", "L", "V", "V" },
        { "N", "N", "O", "Y", "U", "O", "R", "S", "N", "F", "R", "H", "R", "Y", "C", "V", "L", "G", "H", "A", "K", "J", "L" },
        { "D", "N", "V", "W", "T", "R", "E", "S", "T", "E", "V", "O", "T", "A", "E", "T", "R", "O", "W", "C", "Y", "Z", "A" },
        { "I", "E", "U", "E", "H", "A", "J", "I", "A", "M", "W", "N", "H", "T", "N", "O", "I", "A", "R", "K", "I", "T", "G" },
        { "A", "S", "T", "N", "D", "C", "W", "P", "N", "O", "E", "H", "C", "E", "E", "A", "R", "C", "C", "I", "O", "M", "A" },
        { "N", "O", "J", "Q", "A", "H", "E", "P", "A", "V", "A", "I", "A", "G", "E", "E", "I", "U", "U", "K", "D", "C", "J" },
        { "A", "T", "H", "Y", "K", "T", "N", "I", "A", "E", "L", "N", "R", "M", "O", "S", "T", "S", "A", "T", "A", "A", "A" },
        { "P", "A", "E", "D", "O", "U", "S", "D", "W", "L", "O", "S", "O", "K", "P", "N", "S", "D", "I", "L", "Y", "M", "O" },
        { "I", "W", "X", "I", "T", "O", "A", "I", "I", "A", "X", "D", "L", "Z", "E", "S", "H", "E", "I", "U", "A", "N", "R" },
        { "A", "R", "S", "L", "A", "S", "S", "N", "K", "Q", "K", "A", "I", "K", "I", "T", "H", "F", "N", "B", "O", "X", "E" },
        { "W", "H", "U", "J", "D", "C", "O", "O", "M", "M", "H", "S", "N", "D", "R", "R", "O", "I", "A", "N", "J", "L", "G" },
        { "O", "S", "D", "O", "O", "I", "U", "J", "F", "O", "K", "B", "A", "O", "I", "R", "A", "L", "R", "K", "E", "O", "O" },
        { "I", "S", "V", "N", "S", "V", "E", "R", "M", "O", "N", "T", "N", "L", "N", "R", "A", "Q", "T", "E", "C", "T", "N" },
        { "T", "Z", "S", "U", "R", "S", "H", "A", "W", "A", "I", "I", "E", "I", "A", "A", "R", "K", "A", "N", "S", "A", "S" },
        { "V", "I", "W", "A", "S", "H", "I", "N", "G", "T", "O", "N", "A", "L", "X", "D", "N", "A", "L", "Y", "R", "A", "M" },
        { "N", "W", "N", "T", "L", "B", "N", "M", "N", "R", "R", "H", "O", "D", "E", "I", "S", "L", "A", "N", "D", "E", "C" },
        { "H", "A", "T", "U", "S", "T", "T", "E", "S", "U", "H", "C", "A", "S", "S", "A", "M", "X", "S", "A", "X", "E", "T" }
    };
    
    private BasicGrid grid;

    @Before
    public void setUp() {
        grid = new BasicGrid(GRID);
    }

    @Test
    public void testGetLetterAt() {
        String[][] testGrid = new String[GRID.length][];
        Point dummy = new Point(0, 0);
        
        for (int r = 0; r < GRID.length; r++) {
            String[] col = new String[GRID[r].length];
            
            for (int c = 0; c < GRID[r].length; c++) {
                dummy.y = r;
                dummy.x = c;
                col[c] = grid.getLetterAt(dummy);
            }
            
            testGrid[r] = col;
        }
        
        assertTrue(Arrays.deepEquals(GRID, testGrid));
    }

    @Test
    public void testMarkLetterAt() {
        fail("Not yet implemented");
    }

    @Test
    public void testIsValidLetter() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetRows() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetCols() {
        fail("Not yet implemented");
    }

}
