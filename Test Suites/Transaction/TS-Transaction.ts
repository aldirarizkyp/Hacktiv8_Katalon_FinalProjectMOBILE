<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS-Transaction</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>427a7072-17c3-4d4f-b94f-3c3f75902aed</testSuiteGuid>
   <testCaseLink>
      <guid>f547688b-4836-4a43-be48-d2346848603a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Make a Payment Test Cases/TC-Make a Payee</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>4209e4a6-98cb-4c24-af63-a0649e4800cb</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DataPayee</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>4209e4a6-98cb-4c24-af63-a0649e4800cb</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>payeeName</value>
         <variableId>8f81cf32-fece-4273-af5e-7107c73e95cf</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a70e841c-b0c1-41f1-9e0a-3270b1c9a2b1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Make a Payment Test Cases/TC-Check to Make a Payment with Payee from BCA</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>0493743e-71a8-46df-b620-126d9b517923</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Make a Transfer Test Cases/TC-Make an Interaccount Transfer From test bank to BCA</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
