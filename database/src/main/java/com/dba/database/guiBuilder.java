package com.dba.database;
import javax.swing.*;
import  javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class guiBuilder {
    //Labels for columns
    /* ------------ LABELS --------------------*/
    static JFrame databaseClient; static JLabel id;
    static JLabel errorCode; static JLabel errorMessage;
    static JLabel technology; static JLabel uc4Client;
    static JLabel application; static JLabel developer;
    static JLabel jobPlan; static JLabel job;
    static JLabel stepsToReproduce; static JLabel resolution;
    static JLabel pillar; static JLabel sdlc;
    static JLabel valueStream; static JLabel requestor;
    static JPanel labelHolder;
    static JTextField searchBar;

    /* -----------------------DROPDOWNS------------------------- */
    static JComboBox errorCodeDrop; static JComboBox technologyDrop;
    static JComboBox uc4ClientDrop;static JComboBox applicationDrop;
    static JComboBox developerDrop; static JComboBox jobPlanDrop;
    static JComboBox jobDrop; static JComboBox pillarDrop;
    static JComboBox sdlcDrop;static JComboBox valueStreamDrop;

    /* ------------------- INITIALIZING STATIC OBJECTS ---------------- */

    static final String errorCodes[] = {
            "200", "201", "202", "400", "401", "403", "404", "500"
    };
    static final String technologies[] = {
            "Apache Flink", "APIGEE", "UC4", "Ververica", "ForgeRock", "Kubernetes", "Harness", "Redis",
            "GraphQL", "HashiCorp Vault", "Kafka Watcher", "Kafka", "S3"
    };
    static final String uc4Clients[] = {
            "1900", "1950","1975"
    };
    static final String applications[] = {
            "CFTC-16", "WIM", "RTC", "EDSDeP", "SOSA", "LOPR", "DDS"
    };
    static final String developers[] = {
            "Elan Thangamani", "Carlos Jimenez", "Yabi Gebrekidan", "Nicholas Otto", "Kiam Ghavim"
    };
    static final String jobPlans[] = {
            "JP.RTC.DEPLOYMENT_FLOW", "JP.SDP_CTFC"
    };
    static final String pillars[] = {
            "Data", "Risk", "Clearing", "Infrastructure"
    };
    static final String sdlcItems[] = {
            "DEV",
            "ORT",
            "RAT",
            "RIT",
            "Pre-ORT",
            "ORT",
            "EXT"
    };
    static final String valueStreams[] = {
            "SOD",
            "Day-0",
            "Day-1",
            "Environment Buildout"
    };

    /* ----------------- Different views of the appication ---------------*/
    JPanel home = new JPanel();
    /* ------------------ Components method is where the database entry form is built ------------------------- */
    /* --------- Building out JFrame window component -------- */
    public guiBuilder() {
        /* --------------- initializing labels ----------------- */
       /*  errorCode = new JLabel("Error Code");
        errorMessage = new JLabel("Error Message");
        technology = new JLabel("Technology");
        uc4Client = new JLabel("UC4 Client");
        application = new JLabel("Application");
        developer = new JLabel("Developer");
        jobPlan = new JLabel("Job Plan");
        job = new JLabel("Job");
        stepsToReproduce = new JLabel("Steps to Reproduce");
        resolution = new JLabel("Resolution");
        pillar = new JLabel("Pillar");
        sdlc = new JLabel("SDLC");
        valueStream = new JLabel("Value Stream");
        resolution = new JLabel("Resolution");

        /* ------------------ Set font color --------------- */
        /* errorCode.setForeground(Color.white);
        errorMessage.setForeground(Color.white);
        technology.setForeground(Color.white);
        uc4Client.setForeground(Color.white);
        application.setForeground(Color.white);
        developer.setForeground(Color.white);
        jobPlan.setForeground(Color.white);
        job.setForeground(Color.white);
        stepsToReproduce.setForeground(Color.white);
        resolution.setForeground(Color.white);
        pillar.setForeground(Color.white);
        sdlc.setForeground(Color.white);
        valueStream.setForeground(Color.white);
        resolution.setForeground(Color.white);

        //Adding labels to a JPanel container



        labelHolder = new JPanel();
        labelHolder.add(errorCode);
        labelHolder.add(errorMessage);
        labelHolder.add(technology);
        labelHolder.add(uc4Client);
        labelHolder.add(application);
        labelHolder.add(developer);
        labelHolder.add(jobPlan);
        labelHolder.add(job);
        labelHolder.add(stepsToReproduce);
        labelHolder.add(resolution);
        labelHolder.add(pillar);
        labelHolder.add(sdlc);
        labelHolder.add(valueStream);
        labelHolder.add(resolution);
        labelHolder.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
        labelHolder.setBackground(Color.blue);
        */

        JButton nextButton = new JButton("Next");
        JPanel controlPanel = new JPanel();

        searchBar = new JTextField(16);
        //controlPanel.add(nextButton);
        //controlPanel.add(searchBar);
        controlPanel.setBackground(Color.DARK_GRAY);
        nextButton.setBackground(Color.orange);
        nextButton.repaint();
        searchBar.setBackground(Color.gray);
        databaseClient = new JFrame();
        databaseClient.add(controlPanel);
        databaseClient.setSize(1200, 300);
        databaseClient.setTitle("Orchestrator");
        databaseClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        databaseClient.repaint();
        databaseClient.setVisible(true);
    }
}
