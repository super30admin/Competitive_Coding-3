/* Problem Statement:
Verified on leetcode

 Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:

Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:

Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Note:

    The pairs (i, j) and (j, i) count as the same pair.
    The length of the array won't exceed 10,000.
    All the integers in the given input belong to the range: [-1e7, 1e7].

 *
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>

#define HT_SIZE 20000

/* its a HashMap implementation for numbers */

struct hash_array
{
    int key;
    int value;
    bool valid;
    struct hash_array* next;
}hash_array[HT_SIZE];

/* Add entry in hash table. If entry exists, increment value
 *
 */
void add_entry_hash_table(int num)
{
    int temp = abs(num % HT_SIZE);

    if(hash_array[temp].key==0) {
        hash_array[temp].key = num;
        hash_array[temp].value = hash_array[temp].value + 1;
        hash_array[temp].valid = true;

    }else if(hash_array[temp].key==num) {
        hash_array[temp].value = hash_array[temp].value + 1;
        hash_array[temp].valid = true;
    }else {

        struct hash_array *p = &hash_array[temp];

        while(p->key!=num&&p->next!=NULL) {
                p=p->next;
        }

        if(p->key==num){
                p->value = p->value + 1;
        }
        else
        {
            p->next=(struct hash_array*)calloc(1, sizeof(struct hash_array));
            p = p->next;
            p->key = num;
            p->value = p->value + 1;
            p->valid = true;
            p->next = NULL;
        }
    }
}

/* Check if entry is present in hash table for the key. If yes, then return the
 * value stored for that hash table in value and return 0 or 1 based on success/failure */
int is_present_hash_table(int num, int *value)
{

    int temp = abs(num % HT_SIZE);

    if(hash_array[temp].key==num && hash_array[temp].valid == true)
    {
        *value = hash_array[temp].value;
        return 1;
    }else
    {
        struct hash_array *p=&hash_array[temp];
        while((p->key != num) && (p->next != NULL)) {
                p = p->next;
        }
        if(p->key==num && p->valid == true) {
         *value = p->value;
            return 1;
        }
        else
        {
            return 0;
        }
    }
    return 0;
}

/* Check if entry is present in hash table for the key. If yes, then return the
 * value stored for that hash table in value and return 0 or 1 based on success/failure */
int remove_hash_table_entry (int num)
{
    struct hash_array *temp_ptr = NULL;
    int temp = abs(num % HT_SIZE);

    #if 0
    if (hash_array[temp].valid == false) {
        return 0;
    }
    #endif
    if(hash_array[temp].valid == true && hash_array[temp].key==num)
    {
            hash_array[temp].key = 0;
            hash_array[temp].valid = false;            
        return 1;
    }else
    {
        struct hash_array *p=&hash_array[temp];
        struct hash_array *prev = NULL;
        while((p->key != num) && (p->next != NULL)) {
                prev = p;
                p = p->next;
        }
        if(p->key==num && p->valid == true) {
            temp_ptr = p;
            if (prev != NULL)
                prev->next = p->next;
                free(temp_ptr); 
            return 1;
        }
        else
        {
            return 0;
        }
    }
    return 0;
}

void free_hash_table() {
    int idx = 0;

    struct hash_array *p = NULL;
    struct hash_array *temp_ptr = NULL;

    for (idx = 0; idx < HT_SIZE; idx++) {
        p = &hash_array[idx];
        p = p->next;
        while (p != NULL) {
            temp_ptr = p;
            p = p->next;
            free(temp_ptr);
        }
    }
}

int findPairs(int* nums, int numsSize, int k){
    int idx = 0;
    int count = 0;
    int hash_val = 0;
    
    /* Validation checks */
    if (!numsSize) {
        return 0;
    }
    /* as absolute difference is asked, no point checking -ve values */
    if (k < 0) {
        return 0;
        
    }
    /* Prepare global HT for inputs */
    memset(hash_array, 0, sizeof(struct hash_array) * HT_SIZE);
    
    for (idx = 0; idx < numsSize; idx++) {
        add_entry_hash_table(nums[idx]);
        
    }

    for (idx = 0; idx < numsSize; idx++) {
        //printf("looking: %d\n", nums[idx]);
        /* If entry is present, then do the following */
        if (is_present_hash_table(nums[idx], &hash_val)) {
            //printf("%d : %d\n", nums[idx], hash_val);
            /* if k = 0 , it means pair can be only be possible with duplicate values and it should be unique */
            if (k == 0) {
                count += (hash_val >= 2) ? 1 : 0;
                printf("Pair : %d (%d, %d)", count, nums[idx], nums[idx]);
            } else {

                /* Eg : k = 2 for 0,2,4 input can be formed by 0,2 and 4,2*/
                if (is_present_hash_table(nums[idx] - k, &hash_val)) {
                    //printf("Found1 : %d \n",nums[idx] - k);
                    printf("Pair : %d (%d, %d)", count, nums[idx], nums[idx] - k);
                    count++;            
                }

                if (is_present_hash_table(nums[idx] + k, &hash_val)) {
                    printf("Pair : %d (%d, %d)", count, nums[idx], nums[idx] + k);
                    //printf("Found2: %d \n",nums[idx] + k);
                    count++;            
                }               
            }
            /* Once pairs are identified remove it from hash table */
            remove_hash_table_entry(nums[idx]);
            //printf("Removed: %d\n", nums[idx]);            
        }

    }
    /* free the hash table entries ie chained entries in this case */
    free_hash_table();
    return count;
}




int main(int argc, char *argv[]) {
    int *num_p = NULL;
    int idx = 0;
    int final_pairs = 0;

    if (argc < 3) {
        printf("Usage: ./a.out <k> <num1> ... <num n>\n");
        exit(1);
    }
    printf("Input size array : %d , k = %d \n", argc - 2, atoi(argv[1]));

    num_p = (int *)malloc((argc - 1)*sizeof(int));
    if (num_p == NULL) {
        printf("Memory allocation failed \n");
        return -1;
    }

    /* Dont want to change the function, so copying the input to int array */
    for (idx = 2; idx < argc; idx++) {
        num_p[idx - 2] = atoi(argv[idx]);
    }

    //final_len = removeDuplicates(num_p, argc - 1);
    final_pairs = findPairs(num_p, argc - 2, atoi(argv[1]));

    printf("Total Pairs are : %d\n",final_pairs);


    free(num_p);
    return 0;
}


