# QuestionMark
Team QuestionMark -- Tim Marder, Brandon Chong, Bo Hui Lu

## Hypothesis
We think that because it has a runtime of O(n), the time it takes for the sort to happen should increase in a linear fashion for all different cases. However, the arrays that were sorted in descending order probably will take longer than usual, because it's the worst case scenario.


## Background




## Methodology
On arrays with sizes that increase up to 100, run 1000 trials on each size, testing the time it takes to run the sort. This is ran on 6 different situations. With the pivot position starting on the right, we ran it with unsorted arrays, sorted in ascending order arrays, and sorted in descending order arrays. We did the same for pivot positions starting at a random location.



## Results

When the array is unsorted, having the pvtPos on the right vs. having a random pvtPos, both resulted in similar runtimes. However, for both variations of sorted arrays, having the pvtPos on the right resulted in significantly faster runtimes than starting at a random pvtPos.



## Conclusion


