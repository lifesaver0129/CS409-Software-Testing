# MP4: Bug Sharing and Regression 

> 11510225 Yuxing Hu (胡与兴)

1. Check out the latest versions of your selected app A. Run all the tests within the test suite.

  **a)  Has the code changed since the start of the class project? Include the link of the latest commit.**

  No, the code has not changed since the start of project.

  The link of latest commit is: https://github.com/JakeWharton/Telecine/commit/0e4ee6a39d3a929e2ab971451a9eec89cac88bff

  **b)  Are all tests passing when you run them? If some tests fail, you may have found a regression bug, check if the test failure is valid.**

  Yes, all of the tests are passed.

  **c)  Construct 2 test cases that verify the correctness of the changed code from the latest commit at the GUI level. These test cases can be either hand-written or record-and-replay using MonkeyRunner. **

  Unfortunately the last 3 commits are used for configuration change and was not in GUI level. The first change that really maters is `Merge pull request [#160](https://github.com/JakeWharton/Telecine/pull/160) from NightlyNexus/eric.0801.android_dagger` and this changed the present function of recoding screen.

  The link of this commit is: https://github.com/JakeWharton/Telecine/commit/dff11dc62b73eeac5b79303ffe29cb32d86ba253

  Hand-written test cases:

  - Open up a non landscape device => Set display width equals to 2160 and height equals to 3840 => Set camera width equals to 1920 and height equals to 1080 => Call the method => calculateRecordingInfo method retrun new Recording Info (1080, 1920).
  - Open up a landscape device => Set display width equals to -10 and height equals to -10 => Set camera width equals to -1 and height equals to -1 => Call the method => calculateRecordingInfo method retrun new Recording Info (-10, -10).

2. Go to the list of open source Android apps:

   **a) Select a different app B from the same category as your selected app A. Include the category of A and B.** 

   My app is Telecine, and is under the category of tools.

   I select DuckDuckGo as the different app, which is also under tool category.

   **b) Select 5 GitHub issues from B.** 

   * https://github.com/duckduckgo/Android/issues/401
     * This issue is most recently closed issue.
     * No. It's not possible to find a similiar bug in my app. Because this is a clone bug and need to set submodule properly. Since my app don't have such clone issue, it's hard to resume.
   * https://github.com/duckduckgo/Android/issues/400
     * This issue is most recently open issue.
     * No. It's not possible to find a similiar bug in my app. This issue is a recommendation rather than a bug. It encourage developer to create pop up notification when download is finished, which is not the suitable case for me.
   * https://github.com/duckduckgo/Android/issues/347
     * This issue is most commented issue.
     * No. It's not possible to find a similiar bug in my app. The DuckDuckGo is a search engine for everyone and of course it will face some link that unable to open. However telecine is a recoding software and no need to handle an link.
   * https://github.com/duckduckgo/Android/issues/385
     * This issue is most recent commented issue.
     * No. It's not possible to find a similiar bug in my app. It will happen when open a picture file and it's hard to happen in my app, since there's no picture uploading buttons.
   * https://github.com/duckduckgo/Android/issues/284
     * This issue is most relevant issue.
     * No. It's not possible to find a similiar bug in my app. Currently there's a evening/bright mode in my app however I didn't found any bug within it.

   **c) Select a different app C from different category as your selected app A. Include the category of A and B.** 

   The origine app of me is Telecine, and the app I select previously is DuckDuckGo, both of which is from tool category. And I select Onmi-notes as third notes for this section..

   **d) Select 5 GitHub issues from C.** 

   - https://github.com/federicoiosue/Omni-Notes/issues/635
     - This issue is most recently closed issue.
     - No. It's not possible to find a similiar bug in my app. In Telecine, there's only one language which is english, and I don't see any needs to create new languages parkage.
   - https://github.com/federicoiosue/Omni-Notes/issues/625
     - This issue is most recently open issue.
     - No. It's not possible to find a similiar bug in my app. This issue is a counting number feature of the app, however my app don't have such feature.
   - https://github.com/federicoiosue/Omni-Notes/issues/23
     - This issue is most commented issue.
     - No. It's not possible to find a similiar bug in my app. This issue is discussing logo of the app.
   - https://github.com/federicoiosue/Omni-Notes/issues/632
     - This issue is most recent commented issue.
     - No. It's not possible to find a similiar bug in my app. It will happen on different android version, which is not suitable for my app. My app can work on almost all version of android.
   - https://github.com/federicoiosue/Omni-Notes/issues/628
     - This issue is most relevant issue.
     - No. It's not possible to find a similiar bug in my app. Although this issue is supposing a new UI design for setting panel, which is also necessary in my part, I didn't see any improper way of swithching different pages.

3. Compare the bug-finding method in Question 1 (Code Changes) and Question 2 (Similar Bug from different apps). 

   **a) Have you found any bug using any of the above method? Which method do you think is more effective in finding new bugs? Why? Explain the reason in terms of efficiency (time taken) and effectiveness (likelihood of finding new bugs)** 

   No, I have not found any bug using above method. 

   I think code changing is a better way to find bugs.

   Because overseeing different app can take us a lot of time and if the type of the app is different, it's very difficult and has low potential to findnew bugs. Unlike finding bugs from old version of app, which is at least in the right track of finding a bug.