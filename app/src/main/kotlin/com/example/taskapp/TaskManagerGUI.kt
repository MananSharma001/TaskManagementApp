import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class TaskManagerGUI : JFrame("Task Manager") {
    private val taskList = DefaultListModel<String>()
    private val taskJList = JList(taskList)
    private val taskInput = JTextField(20)
    private val addButton = JButton("Add Task")

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(400, 300)
        layout = BorderLayout()

        // Top Panel (Input + Button)
        val topPanel = JPanel()
        topPanel.add(taskInput)
        topPanel.add(addButton)

        // Center Panel (Task List)
        val centerPanel = JScrollPane(taskJList)

        // Add Components to Frame
        add(topPanel, BorderLayout.NORTH)
        add(centerPanel, BorderLayout.CENTER)

        // Button Click Event to Add Task
        addButton.addActionListener {
            val task = taskInput.text.trim()
            if (task.isNotEmpty()) {
                taskList.addElement(task)
                taskInput.text = "" // Clear input field
            }
        }

        isVisible = true
    }
}

// Run GUI
fun main() {
    SwingUtilities.invokeLater { TaskManagerGUI() }
}
