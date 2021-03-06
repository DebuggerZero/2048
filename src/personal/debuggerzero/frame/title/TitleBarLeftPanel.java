package personal.debuggerzero.frame.title;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @author DebuggerZero
 */
public class TitleBarLeftPanel extends JPanel{
    public JLabel jLabel;

    public TitleBarLeftPanel(String title){
        //左对齐
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //设置标题栏
        jLabel = new JLabel(title, SwingConstants.CENTER);
        //设置 icon 图标
        ImageIcon icon = new ImageIcon("assets/icon/logo.png");
        //设置 icon 大小
        icon.setImage(icon.getImage().getScaledInstance(20, 20 ,Image.SCALE_AREA_AVERAGING ));
        jLabel.setIcon(icon);
        //设置字体
        jLabel.setFont(new Font("方正粗黑宋简体", Font.PLAIN,15));
        //设置边框
        this.setBorder(new EmptyBorder(5,5,5,5));
        this.setBackground(Color.WHITE);
        this.add(jLabel);
    }
}
