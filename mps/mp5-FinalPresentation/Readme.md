# Final Report

## Group Name

* Exit Code 0



## Members

- 11510225 Yuxing Hu (胡与兴) [@lifesaver0129](https://github.com/lifesaver0129)
- 11510003 Sitong Liu (刘斯彤) [@Liu-Sitong](https://github.com/Liu-Sitong)
- 11510064 Lin Wang (王林) [@Hanswanglin](https://github.com/Hanswanglin)
- 11510255 Jingxin Wu (吴景新) [@JXWu](https://github.com/xwoooo)



## Open-source project

| Name             | Link                                       | Person in charge |
| ---------------- | ------------------------------------------ | ---------------- |
| **Telecine**     | https://github.com/JakeWharton/Telecine    | Yuxing Hu        |
| **Minimal-Todo** | https://github.com/avjinder/Minimal-Todo   | Sitong Liu       |
| **RedReader**    | https://github.com/QuantumBadger/RedReader | Lin Wang         |
| **NewPipe**      | https://github.com/TeamNewPipe/NewPipe     | Jingxin Wu       |



## Introduction of all the selected apps

* Telecine:
  * An advanced recording app for Android phones
  * Record full-resolution video on your Android devices.


* Minimal-ToDo:
    * A fully Material ToDo app with minimal features, just enough to be useful.



* RedReader:
  * An unofficial, open source client for reddit.
  * Simple view to browse.
  * View many item list in one page.
  * Add Reddit Account.
  * Look through your personal info.
  * Various app setting.
  * Searching comment.

* NewPipe
    *  Newpipe is a libre lightweight streaming frontend for Android. 



## Describe the collaboration

* Project proposal
    * Each team member is in charge of their on app, because almost every part of it is seperated by different APP.

* Progress report
    * Each team member is in charge of their on app, because almost every part of it is seperated by different APP.

* Final Presentation
    * Yuxing Hu:
        * Introduction
        * Timeline
        * Testing Techniques
    * Lin Wang
        * Testing Techniques
        * Experimental Results
    * Jingxin Wu
        * Experimental Results
        * Conclusions
    * Sitong Liu
        * Conclusion
        * Future Works

* Final Report
    * Yuxing Hu:
        * Names and IDs
        * Introduction
        * Collaboration
        * Compare Different Ways of Modeling Software
        * Tools and Methodology
    * Lin Wang
        * Systematic testing
        * Tools and Methodology
        * Experimental Results
    * Jingxin Wu
        * Tools and Methodology
        * Experimental Results
        * Conclusions
    * Sitong Liu
        * Conclusion
        * Future Works
        * After Question



## Compare, contrast and related

* IDM 
    * The input domain of a program is all the possible inputs to that program.
    * Testing is fundamentally about choosing finite sets of values from the input domain.
    * However, this method didn't provide many bug for us because it's very hard to find a proper way to achieve IDM test in our program.

    ![img](https://lh6.googleusercontent.com/zbatkDaGG3plDAuNSJYBXQvFRi2BDtoj2k7SdQ0VDHpgEURMrxDlCCtY3JvL_A1iAVw-WSDDrXaYO1gGW68g3r8gan52NZdzk6Hh_Gahjf5WwWI4qXtFImObCOK5Zgxxm6Cjo4ckRe4)
* Graph
    * The Event-Flow Graph Generator computes the event-flow graph for a GUI.
    * Using this the tester creates and edits the event-flow graph for a GUI.
    * We found several bug using this method because a clear understanding of overall process is a great way to realize the intention of programmer. We found bugs like poll down menu here.

    ![img](https://lh3.googleusercontent.com/NsErPVIwdJJp7zBlBSZEJdBWaBS1sd24Iv1th_m8DxyJD-O43Qa9ReBz8lyE_-zxixNnYlXBZzjPX4LuBSfBllnvK9pqOSlr4D8tfIMVsocvD0Ugh6rc4T6rUtaLTaBfT5ZZBwtDNzs)
* Logic
    * Logic corresponds to the internal structure of the code and this testing is adopted for safety-critical applications such as softwares used in aviation industry. This Test verifies the subset of the total number of truth assignments to the expressions.
    * However this method is not very useful for our programs because it's also very hard to implement in real program since there's too many possibility of the occurance of bug.
* Syntactic Expression
    *  Lots of software artifacts follow strict syntax rules
    *  Syntax is often expressed as a grammar in a language such as BNF
    *  The problem of this method is that we are testing the realworld programm and it's hard to simplify into several expression. 



##  Systematic testing

* When testing your app, do you think that randomly clicking on the app are more effective than systematic testing using the four ways of modeling software described above? 

    *  It is not a completely black or completely white thing to evaluate the effect of these testing method. That is to say, when it is the stage of first contact the entire project, it is more recommendatory to randomly click which is a more meaningful way to understand the Android Project in advance and find some bugs that is not related to program code but network or else.
    *  However, when you dig into the nature of program, it is the time to understand the detail of code, which need to systematic model method for targeted analysis.
    *  To sum up, the systematic methods are more effetive in fault localization.

* Compute the statistics of number of bugs that your group found through random clicking/systematic testing 

    *  4 : 1



## Tools and Methodology

* Describe your experience of using the following approaches:
  * GitHub classroom versus other code submission system
      * We found several bugs by reviewing other students' submission. Some time it's just effective to talk to others and learn what to do.
      * This course is the first course for us in SUSTech that using GitHub classroom. I think it's a great benefit for us to use it since it's very convenience for us to do so. We don't have to use Sakai to upload documents and there's a place for us to discuss with each other.
  * Monkey
      * It's a technique in software testing where the user tests the application by providing random inputs and checking the behavior.
      * Monkey testing is an effective way to identify some out-of-the-box errors, and can also be a good way to perform load and stress testing. The intrinsic randomness of monkey testing also makes it a good way to find major bugs that can break the entire system. The setup of monkey testing is easy, therefore good for any application. 
      * Smart monkeys, if properly set up with an accurate state model, can be really good at finding various kinds of bugs.

  ![img](https://lh6.googleusercontent.com/cXNsrYi_ZFgtr7DKITSbxIajQb80NYUf3Wn-YnVH4MYG1XwAcAthpleVIpJmTZkAbxiO6HTh-mun1yX7sWjZt6i_xGXlQ4O-izsxk6jEipJBAPFUHPG8hUs30CCWoQ10jc_V-JROCRQ)

  * JUnit
      * JUnit is a unit testing framework for the Java programming language. JUnit has been important in the development of test-driven development, and is one of a family of unit testing frameworks which is collectively known as xUnit that originated with SUnit.
      * This method is not very useful because it can only find outs some simple bug and obvious on logic.
  * Regression testing
      * Regression testing is the process of testing changes to computer programs to make sure that the older programming still works with the new changes. Regression testing is a normal part of the program development process and, in larger companies, is done by code testing specialists.
      * As an integral part of the software life cycle, regression testing has a large workload in the entire software testing process, and multiple regression tests are performed at various stages of software development. In progressive and rapid iterative development, the continuous release of the new version makes the regression test more frequent, while in the extreme programming method, it is required to perform several regression tests every day. Therefore, it makes sense to improve the efficiency and effectiveness of regression testing by choosing the right regression test strategy.
  * Mutation testing 
      * It is one type of White Box testing, which is used to design new software tests and evaluate the quality of existing software tests. 
      * In this software testing course, we learnt about the mutation testing mainly throught an online game called **Code Defenders**. There are several testable java class code in the website. Participants in the game will paly the role of **Attacker** or **Defender**. For the exist code, attacker need to create mutants and acquire corresponding score while the defender will write unit tests to kill this mutant and acquire corresponding score.
      * The purpose of mutation testing is to help the tester develop effective tests or locate weaknesses in the test data used for the program or in sections of the code that are seldom or never accessed during execution.
  * Delta Debugging 
      * Delta Debugging is a methodology to automate the debugging of programs using a scientific approach of hypothesis-trial-result loop. To put it simply, the main idea is to simplify test data step by step. Generally, the input data (whether its form is real data or test code) will be divded into two equal portions. One input reveals the bug while the other does not. And then repeat these step to apply to the new portion of input data which reveals bug.
      * However, we did not apply the debugging method to our projects and it is indeed a bulky dataset-demand method. The prerequisite conditions is a liitle hard to realize.
  * Z3 
      * Z3 is a state-of-the art theorem prover from Microsoft Research. It can be used to check the satisfiability of logical formulas over one or more theories.
      * To experience the validity of such logical checker, we learnt some basic command of Z3 and try some practical exercise. By using Z3 to maintain a stack of assertions provided by user, "get-model" can retrieve an interpretation that makes all formulas true. Another impressive example, Using Z3 at the restaurant. With listing several constants, Z3 is able to obtain different values at different requirement which is also meet the primal need.
      * Z3 is best used as a component in the context of other tools that require solving logical formulas. With its simplified syntax, we can analyse and verify our program in software testing more easily.
  * Bug Sharing 
      * Bug Sharing is a method to find similar bug from other project and revise ourselves'.
      * This attempts including inside category and inter category
      * We found several bugs using this method, it turns out that this is a effective way and easy to compare especially in same category. Programmer tends to ignore same area of feature.
  * Others approaches covered in class 
    * Event Listener: 
      * Attaches an event handler to an element without overwriting existing event handlers.
  * Summarize the statistics of the total bug founds


| App name     | Link to Github issues                                 | Methods Used to find bugs | Bugs find during which MP/Project submissions | Status of the Bug Report(Reported,Confirmed,Fixed) |
| ------------ | ----------------------------------------------------- | ------------------------- | --------------------------------------------- | -------------------------------------------------- |
| NewPipe      | https://github.com/TeamNewPipe/NewPipe/issues/1946    | Bug Sharing               | MP4                                           | Reported                                           |
| NewPipe      | https://github.com/TeamNewPipe/NewPipe/issues/1945    | Bug Sharing               | MP4                                           | Reported                                           |
| Minimal-Todo | <https://github.com/avjinder/Minimal-Todo/issues/117> | Graph Edge Coverage       | MP2                                           | Reported                                           |
| Telecine     | https://github.com/JakeWharton/Telecine/issues/184    | Graph Edge Coverage       | MP2                                           | Confirmed                                          |
| RedReader    | https://github.com/QuantumBadger/RedReader/issues/643 | Monkey Testing            | MP3                                           | Reported                                           |




## Experimental Results 

###  Explain the criteria


* We gather information by collecting time that we consume on our apps and the bug statistics data (general bug numbers of ours and other groups’).

* The more possible a method can find a bug, the higher  effectiveness is.
* The more time a method consume, the lower efficiency is.


| Method                                         | JUnit  | Input Domain  Modeling | Graph Edge Coverage | Event Listening | Monkey Testing | Bug Sharing |
| ---------------------------------------------- | ------ | ---------------------- | ------------------- | --------------- | -------------- | ----------- |
| effectiveness (likelihood of finding new bugs) | middle | middle                 | high                | middle          | high           | high        |
| efficiency (1/time taken)                      | high   | high                   | middle              | middle          | low            | low         |

### Present your key results 

* Our main results is to find five bugs.
    * Bugs cover all our selected apps.
    * Bugs cover three methods we learned in class.
    * Most bugs can be common and cause terrible user experience.
    * All bugs are distinct.

| App name     | Methods Used to find bugs | Brief bug description                                        | Reproduciable | Emergency |
| ------------ | ------------------------- | ------------------------------------------------------------ | ------------- | --------- |
| NewPipe      | Bug Sharing               | Cleared history can be exported and come back again          | Yes           | High      |
| NewPipe      | Bug Sharing               | When imported from previous exported file, subscription updates strangely | Yes           | Middle    |
| Minimal-Todo | Graph Edge Coverage       | The app crashes when entering the app from a reminder in the notification bar, if the respective to-do has been deleted | Yes           | High      |
| Telecine     | Graph Edge Coverage       | The status of the recording occludes the taskbar             | Yes           | Middle    |
| RedReader    | Monkey Testing            | UpVote or DownVote certain strip by the way of swiping left or right about three or four times, the app will pop up a windows with the "429 Too Many Requests” | Yes           | Middle    |

### Discuss your results
* Any interesting observations/unexpected results?
    * JUnit tests are easier for developers to design. Running JUnit tests in regression test is not useful because developers will do so before releasing.
    * Monkey testing is not efficient enough but it may discover some bugs we never think about.

    * Bug sharing is much more inspired than our expections. We suppose that developers are likely to make similar mistakes.
* Describe the root cause (e.g., memory error, activity lifecycle, concurrency) of the new bugs that you found. 
    * The root cause of the new bugs are:
        * Memory error. Program developers did not release memory when the apps are closed.
        * Activity lifecycle. Some programs react abnormally on the behavior. 



## Conclusions

* Conclude with the main ideas and results of your work. 
     1. Graph coverage, Monkey testing and bug sharing are techniques with high effectiveness.
        * Graph coverage can cover lots of operations during the use the APPs.
        * Monkey testing can automatically general a large amount of random inputs.
        * Bug sharing is useful probrably because some mistakes are common, so programmers are likely to make these similar mistakes. If a bug occurs in a APP, it is possible that other APPs contain same bugs.
     2. Even if it seems that there is no bugs on your software when you test it on your own device, there can be some obvious bugs on a different device or OS version.
        * For example, *Telecine* has obvious bugs in later Android version. Operation Systems update rapidly now, when new versions are launched, developers need to make sure the applications still work well.

![img](https://lh5.googleusercontent.com/SeM2V9PWfrKw-HzEUeWh6M31tY6p2Cy76rYacOKDOfn69tF6WBR0wpuh6elVZHdPzSdJWgCRlLP1osAJAIF3BScuQIYeB_9AjA7Nwwjzc4Tt4DQJz_9BO6EaICQX0qFdvNXSu_W9iIM)

## Future Work

* Discuss lessons learned and future directions for your work 

  * What lessons did you learn from your project?
    * Before we launch or update our software, we need to test them with many techniques to reduce bugs. Now we know many new techiques (as introduced before) to find bugs.
    * We need to consider special cases as much as possible to avoid bugs. Although some APPs are simple, there are still many situations that are not well considered, which lead to bugs.
    * Learn some skills of using gradle build tools and reading Logcat to help us debug.

  * What was difficult? 
    * Have to spend much time on different methods but these work may turn out not profitable (if there is no bug in this part)
    * Reproduce bugs exactly.
    * These open-source APPs are simple and actively maintained, so likelihood of finding new bugs is not very high (good for developers but bad for Software Engineering students).
    * Fault localization.

  * What do you wish you could have done (or done differently)? 
    * Set Monkey testing with a larger number of random inputs. It is possible to find more new bugs if we leave Monkey run for a long period.
    * Apply the methods that learned from the class on our own projects with more practical cases.

  * How could your project be extended...what's next? Are there any interesting problems or questions that resulted from your work? 
    * Try to extend the bugs that we found to find more bugs in similar situation. 
    * Help developers to reproduce and fix the bugs if they reply our issues.
    * Questions: How to avoid such bugs in the developing process? 



## Question: After listening 

* Which bugs presented could be possibly reproduced in the app for your group? Or have you learn about new technique/evaluation criteria that will help to improve your report? 
    * Bugs in Minimal-ToDo: 1. The reminder time of tasks does not update in time; 2. No button for submitting snooze time. The above two bugs reported by another group can be reproduced exactly in my own device.
* Vote for the best group (you cannot choose your own group). Why do you think that this group deserve to be the best group? 
    * BlackPink. They had a very prospective view of finding bugs and had a really impressive result.