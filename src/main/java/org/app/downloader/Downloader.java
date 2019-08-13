package org.app.downloader;

import java.util.ArrayList;

public class Downloader implements Coordinator {
    private ArrayList < Task > tasks;

    public Downloader() {
        tasks = new ArrayList <>();
    }


    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public ArrayList < Task > getTasks() {
        return tasks;
    }

    @Override
    public void removeTask(int id) {
        tasks.remove(id);

    }

    @Override
    public void removeAllTasks() {
        tasks.clear();
    }

    @Override
    public void runTask(int id) {

    }

    @Override
    public void runAllTasks() {

    }

    @Override
    public void stopTask(int id) {

    }

    @Override
    public void stopAllTasks() {

    }

    @Override
    public void pauseTask(int id) {

    }

    @Override
    public void pauseAllTasks() {

    }
}
