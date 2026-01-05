package de.itwerkstatt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private final static Logger LOG = LogManager.getLogger(Main.class);

    private static int counter = 1;

    public static void main(String[] args) {
        LOG.info("Application started");
        try {
            while (!Thread.currentThread().isInterrupted()) {
                LOG.trace("Log message #{} level TRACE. Current time: {}", counter, java.time.Instant.now());
                LOG.debug("Log message #{} level DEBUG. Current time: {}", counter, java.time.Instant.now());
                LOG.info("Log message #{} level INFO. Current time: {}", counter, java.time.Instant.now());
                LOG.warn("Log message #{} level WARN. Current time: {}", counter, java.time.Instant.now());
                LOG.error("Log message #{} level ERROR. Current time: {}", counter, java.time.Instant.now());
                Thread.sleep(5000);
                counter++;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOG.info("Interrupted, shutting down");
        }
    }
}