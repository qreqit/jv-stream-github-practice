package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    @Override
    public boolean test(Candidate candidate) {
        String[] str = candidate.getPeriodsInUkr().split("-");
        boolean isPeriodAcceptable = (Integer.parseInt(str[1]) - Integer.parseInt(str[0])) >= 10;
        return candidate.getAge() >= 35
                && candidate.isAllowedToVote()
                && candidate.getNationality().equals("Ukrainian")
                && isPeriodAcceptable;
    }
}
