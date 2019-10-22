package grsoft.com.br.americanfootballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displaForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displaForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addSafety(View view) {
        if (view.getId() == R.id.addSafetyA) {
            scoreTeamA += 2;
            displaForTeamA(scoreTeamA);
        } else {
            scoreTeamB += 2;
            displaForTeamB(scoreTeamB);
        }
    }

    public void addExtraPoint(View view) {
        if (view.getId() == R.id.addExtraPointTeamA) {
            scoreTeamA += 1;
            displaForTeamA(scoreTeamA);
        } else {
            scoreTeamB += 1;
            displaForTeamB(scoreTeamB);
        }
    }

    public void addFieldGoal(View view) {
        if (view.getId() == R.id.addFieldGoalTeamA) {
            scoreTeamA += 3;
            displaForTeamA(scoreTeamA);
        } else {
            scoreTeamB += 3;
            displaForTeamB(scoreTeamB);
        }
    }

    public void addTouchdown(View view) {
        if (view.getId() == R.id.addTouchdownTeamA) {
            scoreTeamA += 6;
            displaForTeamA(scoreTeamA);
        } else {
            scoreTeamB += 6;
            displaForTeamB(scoreTeamB);
        }
    }

    public void reset(View view) {
        scoreTeamA = 0;
        displaForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displaForTeamB(scoreTeamB);
    }
}
