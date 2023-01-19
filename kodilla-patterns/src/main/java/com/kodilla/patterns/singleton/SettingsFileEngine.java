package com.kodilla.patterns.singleton;

public enum SettingsFileEngine {
    INSTANCE;
    private String fileNAme="";

    public String getFileNAme() {
        return fileNAme;
    }
    public void open(final String fileNAme){
        this.fileNAme=fileNAme;
        System.out.println("Opening the settings file");
    }

    public void close(){
        this.fileNAme="";
        System.out.println("Closing the settings file");
    }
    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }
    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}
