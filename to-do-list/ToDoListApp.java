import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
//A To-Do List is an application where users can add tasks, view them, mark tasks as completed, and remove tasks when done.

public class ToDoListApp implements ActionListener {
    JFrame frame;
    JLabel label;
    JTextField textField;
    JTextArea textArea;
    JButton addButton, removeButton, markButton, clearButton;

    private ArrayList<Task> tasks;

    public ToDoListApp() {
        frame = new JFrame("To-Do List");
        label = new JLabel("Add a Task: ");
        textField = new JTextField(20);
        textArea = new JTextArea();
        addButton = new JButton("Add Task");
        removeButton = new JButton("Remove Task");
        markButton = new JButton("Mark as Completed");
        clearButton = new JButton("Clear Tasks");

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        label.setBounds(20, 30, 100, 30);
        textField.setBounds(120, 30, 200, 30);
        addButton.setBounds(120, 70, 100, 30);
        markButton.setBounds(230, 70, 150, 30);
        removeButton.setBounds(120, 110, 200, 30);
        clearButton.setBounds(120, 150, 200, 30);
        textArea.setBounds(20, 190, 440, 150);
        textArea.setEditable(false);

        frame.add(label);
        frame.add(textField);
        frame.add(addButton);
        frame.add(markButton);
        frame.add(removeButton);
        frame.add(clearButton);
        frame.add(textArea);

        addButton.addActionListener(this);
        removeButton.addActionListener(this);
        markButton.addActionListener(this);
        clearButton.addActionListener(this);

        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
        updateTaskList();
    }

    public void removeTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
            updateTaskList();
        } else{
            JOptionPane.showMessageDialog(frame, "couldn't remove.");
        }
    }

    public void markTaskAsCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).markAsCompleted();
            updateTaskList();
        }else{
            JOptionPane.showMessageDialog(frame, "couldn't mark as completed.");
        }
    }

    public void updateTaskList() {
        textArea.setText("");
        for (int i = 0; i < tasks.size(); i++) {
            textArea.append((i + 1) + ". " + tasks.get(i) + "\n");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == addButton) {
            String taskDescription = textField.getText();
            if (!taskDescription.isEmpty()) {
                addTask(taskDescription);
                textField.setText(""); 
            }
        }

        if (source == removeButton) {
            String input = JOptionPane.showInputDialog("Enter task number to remove:");
            
            if (input == null) {
                return;
            }
            
            try {
                int taskIndex = Integer.parseInt(input) - 1;
                removeTask(taskIndex);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid task number.");
            }
        }
        
        if (source == markButton) {
            String input = JOptionPane.showInputDialog("Enter task number to mark as completed:");
            if(input == null)
            return;
            try {
                int taskIndex = Integer.parseInt(input) - 1;
                markTaskAsCompleted(taskIndex);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid task number.");
            }
        }

        if (source == clearButton) {
            tasks.clear();
            updateTaskList();
        }
    }

    public static void main(String[] args) {
        new ToDoListApp();
    }
}

class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[Completed] " : "[Not Completed] ") + description;
    }
}
