[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16158469&assignment_repo_type=AssignmentRepo)
# SortAnal
<p>This Programming Assignment is based on Levitin Exercise 2.6 # 2abc. </p>

> 2. a. Run the program of Problem 1, with a properly inserted counter (or counters)
for the number of key comparisons, on 20 random arrays of sizes 1000,
2000, 3000, . . . , 20,000.<br>
b. Analyze the data obtained to form a hypothesis about the algorithm’s
average-case efficiency.<br>
c. Estimate the number of key comparisons we should expect for a randomly
generated array of size 25,000 sorted by the same algorithm.

<p>You need to follow the specifications given below.</p>
<p>Implement the algorithm and "driver" in Java.</p>
<p>For 2b, I want you to show your work and justify your hypothesis. I will be grading you on your justification as well as the programming.</p>
<p>Here are additional specifications for your code.</p>
<ul>
<li>In addition to running the algorithm on the random arrays as indicated in 2a, I also want you to run the algorithm against the arrays sorted in ascending order, and then again on arrays already sorted in descending order. Perform the analysis for all three situations.</li>
<li>Most people will create a spreadsheet or some kind of table with both actual and hypothetical values.</li>
<li>You may also graph the data, although this will be of limited benefit. (As usual, I'm happy to elaborate on request.)</li>
<li>If you don't justify your conclusion, you will not receive full credit.</li>
<li>Make sure you provide a formula for the <em>actual time efficiency</em>, and not merely the algorithm's order of growth.</li>
<li>Your program should run the approximately 60 tests (three runs of 20) in one invocation.&nbsp;Your program should require no user interaction.</li>
<li>You should code the algorithm <i>once</i> (as one method/function), and invoke it from your "driver" method.</li>
<li>Your program should provide output to standard output (the terminal, by default) in a form that can be simply copy and pasted into a spreadsheet.</li>
<li>Make sure you correctly code the book's algorithm, and your counter is correctly counting the comparisons. The comparison count should be exact, not merely approximate.</li>
<li>Do not change the algorithm; you may of course modify the code counting the number of comparisons.&nbsp;</li>
<li>The best way to test your code is to invoke it with several small arrays, so you can manually verify the results.</li>
<li>Follow good coding practices. For example, you should use loops rather than replicating your code 20 times.</li>
<li>Follow good version control practices. Commit early and often. (E.g., submissions with only a single commit are suspect.)
</ul>
<p>Submit both the program source code and electronic documents with your analysis and justification, here in your GitHub repo. When you're done, submit a link to your GitHub repo 
to the PA01 assignment in Blackboard; that will notify me that you're ready for your work to be reviewed and graded.</p>
<p>All programs should follow good style conventions: good comments; good variable names; proper indention. Include your name near the beginning of every file.</p>
<p>Questions? Zulip.</p>
<p><strong>I encourage and expect questions and discussion on this all programming assignments.</strong></p>
