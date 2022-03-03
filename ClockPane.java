import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockPane extends JPanel {

    private JLabel clock;

    public ClockPane() {
        setLayout(new BorderLayout());
        clock = new JLabel();
        clock.setHorizontalAlignment(JLabel.CENTER);
       // clock.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 20f));
        tickTock();
        add(clock);

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tickTock();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();
    }

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public void tickTock() {
        clock.setText(dateFormat.getInstance().format(new Date()));
    }
}
