package org.app.downloader;

import java.util.ArrayList;

/**
 * Interface Coordinator
 */
public interface Coordinator {
    //
    // Accessor methods
    //

    /**
     * Adds task to Coordinator
     */
    void addTask(Task task);

    /**
     * Returns list of tasks.
     *
     * @return Task[]
     */
    ArrayList < Task > getTasks();

    //
    // Methods
    //
    void removeTask(int id);

    void removeAllTasks();

    void runTask(int id);

    void runAllTasks();

    void stopTask(int id);

    void stopAllTasks();

    void pauseTask(int id);

    void pauseAllTasks();
}
