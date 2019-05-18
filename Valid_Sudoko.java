import java.util.*;
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> a) {
        for(int i=0;i<a.size(); i++)
        {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> cols = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            
            for(int j=0;j< (a.get(0)).length(); j++)
            {
                
                // for checking rows
                if( (a.get(i)).charAt(j) != '.' && !rows.add( (a.get(i)).charAt(j) ) )
                    return 0;
                // for checking coloumns    
                if( (a.get(j)).charAt(i) != '.' && !cols.add((a.get(j)).charAt(i)) )
                    return 0;
                    
                int rowIndex = 3*(i/3);
                int colIndex = 3*(i%3);
                
                //for checking individual grid
                if( (a.get(rowIndex + j /3)).charAt(colIndex + j % 3) != '.' && !cube.add((a.get(rowIndex + j /3)).charAt(colIndex + j % 3)) )
                    return 0;
                
            }
        }
        return 1;
    }
}
