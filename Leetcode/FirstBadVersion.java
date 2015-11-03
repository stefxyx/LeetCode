//You are a product manager and currently leading a team to develop a new product.
//Unfortunately, the latest version of your product fails the quality check. 
//Since each version is developed based on the previous version, all the versions 
//after a bad version are also bad.
//Suppose you have n versions [1, 2, ..., n] 
//and you want to find out the first bad one, 
//which causes all the following ones to be bad.
//You are given an API bool isBadVersion(version) 
//which will return whether version is bad. 
//Implement a function to find the first bad version. 
//You should minimize the number of calls to the API.
package Leetcode;

/**
 *
 * @author yingxinxie
 */

/* The isBadVersion API is defined in the parent class VersionControl.
 boolean isBadVersion(int version); */
public class FirstBadVersion {

  public int firstBadVersion(int n) {
    return firstBadVersionHelper(1, n);
  }

  public int firstBadVersionHelper(int start, int end) {
    if (end <= start) {
      return start;
    }
    int mid = start + (end - start) / 2;
    if (isBadVersion(mid)) {
      return firstBadVersionHelper(start, mid);
    } else {
      return firstBadVersionHelper(mid + 1, end);
    }
  }
  
  //this is a faked function just in order to eliminate error in above function
  public boolean isBadVersion(int version){
    return false;
  }
}
