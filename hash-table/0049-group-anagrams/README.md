<!-- LEETCODE_SYNC:START -->
# 49. Group Anagrams

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/group-anagrams/
**Topics:** Array, Hash Table, String, Sorting
**Companies:** Accolite, Adobe, Affirm, Amazon, Anduril, Apple, Athenahealth, Atlassian, Autodesk, Avito, BCG, Blackrock, Blinkit, Bloomberg, Bny Mellon, Capgemini, Cisco, Citadel, Cognizant, Compass, Coupang, Dell, Deloitte, Disney, Docusign, Doordash, Dp World, Ebay, Epam Systems, Expedia, Factset, Freshworks, Goldman Sachs, Google, Hashedin, IBM, Infosys, Instacart, Intuit, Jio, Josh Technology, Jpmorgan, MSCI, Makemytrip, Meta, Microsoft, Millennium, Morgan Stanley, Motive, Netapp, Nielsen, Nike, Nutanix, Nvidia, Oracle, Palo Alto Networks, Park, Paypal, Persistent Systems, Phonepe, Publicis Sapient, SAP, Salesforce, Servicenow, Siemens, Sigmoid, Smartsheet, Snapchat, Squarepoint Capital, TCS, Tiktok, Turing, Twilio, UBS, Uber, Upstart, Visa, Walmart Labs, Wayfair, Whatnot, Wipro, Workday, Yandex, Yelp, Zoho

## Problem

Given an array of strings `strs`, group the anagrams together. You can return the answer in **any order**.

 

Example 1:

**Input:** strs = ["eat","tea","tan","ate","nat","bat"]

**Output:** [["bat"],["nat","tan"],["ate","eat","tea"]]

**Explanation:**

	- There is no string in strs that can be rearranged to form `"bat"`.
	- The strings `"nat"` and `"tan"` are anagrams as they can be rearranged to form each other.
	- The strings `"ate"`, `"eat"`, and `"tea"` are anagrams as they can be rearranged to form each other.

Example 2:

**Input:** strs = [""]

**Output:** [[""]]

Example 3:

**Input:** strs = ["a"]

**Output:** [["a"]]

 

**Constraints:**

	- `1 <= strs.length <= 10^4^`
	- `0 <= strs[i].length <= 100`
	- `strs[i]` consists of lowercase English letters.

## Similar Questions

- [Valid Anagram](https://leetcode.com/problems/valid-anagram/) (Easy)
- [Group Shifted Strings](https://leetcode.com/problems/group-shifted-strings/) (Medium)
- [Find Resultant Array After Removing Anagrams](https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/) (Easy)
- [Count Anagrams](https://leetcode.com/problems/count-anagrams/) (Hard)

## Stats
- Runtime: 19 ms (beats 16.23%)
- Memory: 51.2 MB (beats 5.24%)

<!-- LEETCODE_SYNC:END -->

<!-- USER_NOTES:START -->

## Approach

## Complexity

<!-- USER_NOTES:END -->
