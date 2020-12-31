package com.azure.resourcemanager.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

/**
 * ResourceManagerTestWatcher
 */
public class ResourceManagerTestWatcher implements TestWatcher {
    @Override
    public void testAborted(ExtensionContext extensionContext, Throwable throwable) {
        // do something
    }

    @Override
    public void testDisabled(ExtensionContext extensionContext, Optional<String> optional) {
        // do something
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable) {
        // do something
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        ResourceManagerTestBase testInstance = (ResourceManagerTestBase) extensionContext.getRequiredTestInstance();
        String className = extensionContext.getRequiredTestClass().getName();
        String methodName = extensionContext.getRequiredTestMethod().getName();
        String fileName = testInstance.fileName;

        try {
            File dir = new File(Constants.dataDir);

            if (!dir.exists()) {
                dir.mkdirs();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(
                new File(String.format("%s/%s", Constants.dataDir, fileName)), true));

            bw.append(String.format("|cmsep|%s.%s%s", className, methodName, System.lineSeparator()));

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}