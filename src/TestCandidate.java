import java.util.*;

public class TestCandidate {
    public static void main(String[] args) {
        List<Candidate> candidates = new ArrayList<>();

        // Add 10 candidates
        candidates.add(new Candidate("ID1", "Name1", "01/01/2000", 7.0, 8.0, 9.0));
        candidates.add(new Candidate("ID2", "Name2", "02/02/2001", 6.0, 7.5, 8.5));
        candidates.add(new Candidate("ID3", "Name3", "03/03/2002", 7.5, 8.5, 9.5));
        candidates.add(new Candidate("ID4", "Name4", "04/04/2003", 6.5, 7.0, 8.0));
        candidates.add(new Candidate("ID5", "Name5", "05/05/2004", 7.0, 8.0, 9.0));
        candidates.add(new Candidate("ID6", "Name6", "06/06/2005", 6.0, 7.5, 8.5));
        candidates.add(new Candidate("ID7", "Name7", "07/07/2006", 7.5, 8.5, 9.5));
        candidates.add(new Candidate("ID8", "Name8", "08/08/2007", 6.5, 7.0, 8.0));
        candidates.add(new Candidate("ID9", "Name9", "09/09/2008", 7.0, 8.0, 9.0));
        candidates.add(new Candidate("ID10", "Name10", "10/10/2009", 6.0, 7.5, 8.5));

        for (Candidate candidate : candidates) {
            if (candidate.getTotalScore() > 15) {
                System.out.println(candidate);
            }
        }
    }
}
