#ifndef MIN_MAX_SORT_H
#define MIN_MAX_SORT_H
#include <stddef.h>

template <typename T>
void minMaxSort(T array[], size_t n) {
    for (size_t i = 0; i < n / 2; ++i) {
        size_t min_idx = i;
        size_t max_idx = n - 1 - i;
        for (size_t j = i; j < n - i; ++j) {
            if (array[min_idx] > array[j]) {
                min_idx = j;
            }
            if (array[max_idx] < array[j]) {
                max_idx = j;
            }
        }
        T swapMin = array[min_idx];
        T swapMax = array[max_idx];
        array[max_idx] = array[n - i - 1];
        array[min_idx] = array[i];
        array[n - i - 1] = swapMax;
        array[i] = swapMin;
    }
}

#endif
