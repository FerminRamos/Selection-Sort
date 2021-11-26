## Selection-Sort Description
Just a simple program used as a reference for how to write a Selection Sort Algorithm.

## Key Takeaways of Selection Sort Algorithm
* Sorts an unsorted array in increasing order (left-most value is the 
smallest value)
* Sorts starting from the left-most value (anchor) to the end (length-1). 
* Any values left of the anchor are assumed to be sorted (will always be) 
* Our *range* of values needed to check (if they're of smaller value than our anchor) decreases the more 
values we do. 
* We swap values at the end of our search of ALL terms, since many smaller values may be found, but we're only concerned with 
picking the absolute smallest value that's to the right of our anchor point.
* Selection Sort Algorithm is useful when writing to memory is costly
