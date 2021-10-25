# User Guide

## Introduction

SEPlanner is a lightweight desktop application for Computer Engineering undergraduates to plan for the Student
Exchange Programme, optimised for use via Command Line Interface (CLI).  

## Content Page
* [Quick Start](#quick-start)  
* [Program run through](#program-run-through)  
* [Features](#features)  
  * [Viewing all available universities](#viewing-all-available-universities)
  * [Viewing all selected universities](#viewing-all-selected-universities)
  * [Viewing all available modules](#viewing-all-available-modules)
  * [Viewing all selected modules](#viewing-all-selected-modules)
  * [Adding a partner university](#adding-a-partner-university)
  * [Adding a NUS module](#adding-a-nus-module)
  * [Adding a module mapping](#adding-a-module-mapping)
  * [Finding a specific university](#finding-a-specific-university)
  * [Finding a specific module](#finding-a-specific-module)
  * [Searching for available module mappings](#searching-for-available-module-mappings)
  * [Removing a selected university](#removing-a-selected-university)
  * [Removing a selected NUS module](#removing-a-selected-nus-module)
  * [Removing a selected module mapping](#removing-a-selected-module-mapping)
* [FAQ](#faq)
* [Command Summary](#command-summary)
* [Glossary](#glossary)

## Quick Start

1. Ensure that you have Java 11 or above installed.
2. Download the latest version of `SEPlanner` from [here](https://github.com/AY2122S1-CS2113T-T09-2/tp/releases/tag/v1.0).
3. Copy the file to the folder you want to use as the home folder for your SEPlanner.
4. Double-click the file to start the app.
5. Type the command in the command box and press Enter to execute it.
6. Refer to the Features below for details for each command.

## Program run through
This SEPlanner allows the user to search for mapping through our platform. To do so, users can follow the following steps:
  1. Add partner universities the user is interested in.
  2. Add potential NUS modules that the user wants to add.
  3. Search for potential mapping for a particular selected university.
  4. Select a mapping and add the mapping.

## Features 

### Viewing all available universities: 
Displays all modules from the master list of universities that the user can choose from.  
#### Format: `list /muni`  
#### Example of usage:
* Input: `list /muni`  
Expected output:
```
Here are the universities and module mappings in the list:  
[1] - Aarhus School of Business  
[2] - Aarhus University  
[3] - Arizona State University  
...  
[78] - Uppsala University  
[79] - Waseda University  
[80] - Western University  
```

### Viewing all selected universities:
Displays all universities added, as well as all module mappings added to the university by the user.  
#### Format: `list /suni`  
#### Example of usage:
* Input: `list /suni`  
Expected output:
```
Here are the universities and module mappings in your list:
[40] - Technical University of Munich
    1 | IE4056 - WI001098 : Introduction to Production Scheduling Theory
[80] - Western University
```

### Viewing all available modules: 
Displays all modules from the master list of modules that the user can choose from.  
#### Format: `list /mmod`  
#### Example of usage:
* Input: `list /mmod`  
Expected output:  
```
Here are the modules in the list:  
[1] ACC1701X : Accounting for Decision Makers  
[2] ACC2706 : Managerial Accounting  
[3] AR2102 : Design 4  
...  
[803] TR3008 : Technological Innovation  
[804] UD5221 : Urban Design Theory and Disco  
[805] UD5628 : Critique of Contemporary Urban Design  
```

### Viewing all selected modules
Displays all modules from the master list of modules that the user can choose from.  
#### Format: `list /smod`  
#### Example of usage:
* Input: `list /smod`  
Expected output:
```
Here are the modules in the list:
[102] CS3220   : Computer Architecture
[319] IE4044   : Exchange Elective
[801] ST4991   : Exchange Enrichment Module
[77] CS1010   : Programming Methodology
[72] CM4271   : MEDICINAL CHEMISTRY
[47] CM1417   : Fundamentals of Chemistry
```

### Adding a partner university
Add a partner university the user is interested into the user selected university list.
#### Format: `add /uni <UNIVERSITY_INDEX>` `add /uni <UNIVERSITY_NAME`
>This command accepts either the `<UNIVERSITY_INDEX>` or `<UNIVERSITY_NAME>` as arguments. The `<UNIVERSITY_INDEX>` can be found via `list /muni` command.
> 
#### Examples of usage: 
* Input: `add /uni 24`  
Expected output:
```
New university added: 
[24] - Korea Advanced Inst of Sci & Tech
```
* Input: `add /uni University of California`  
Expected output:
```
New university added: 
[59] - University of California
```

### Adding a NUS module
Add a NUS module that the user wants to complete during SEP into the user selected module list.  
#### Format: `add /mod <MODULE_INDEX>` `add /mod <MODULE_CODE>` 
>This command accepts either the `<MODULE_INDEX>` or `<MODULE_CODE>` as arguments. The `<MODULE_INDEX>` can be found via `list /mmod` command.  
> 
#### Example of usage:
* Input: `add /mod 77`  
Expected output:
```
New module added: 
[77] CS1010   : Programming Methodology
```
* Input: `add /mod CS1010`  
Expected output:
```
New module added: 
[77] CS1010   : Programming Methodology
```

### Adding a module mapping
Adds a specific pair of module mapping under a selected university.

Format: `add /map <UNIVERSITY_INDEX> <MODULE_MAPPING_INDEX>`
>The `<UNIVERSITY_INDEX>` can be found via `list /suni`command and the `<MODULE_MAPPING_INDEX>` can be found via `searchmap <UNIVERSITY_INDEX>` command for the specific university.
> 
#### Example of usage:
* Input: `add /map 4 2`  
Expected output:
```
The following module mapping has been added under:
[4] Boston University
CS1231 - MET CS 248 : Discrete Mathematics
CS1231 - CAS CS131 : Combinatoric Structures
```

### Finding a specific university
Look for universities that matches the user entered keyword.
* The output also consists of the index of the university, which is needed for subsequent commands.  
Format: `find /uni <KEYWORD>`
#### Example of usage:  
* Input: `find /uni California`  
Expected output:
```
[59] - University of California
[60] - University of California, Berkeley
[61] - University of California, Davis
[62] - University of California, Irvine
[63] - University of California, Los Angeles
[64] - University of California, Merced
[65] - University of California, Riverside
[66] - University of California, San Diego
[67] - University of California, Santa Barbara
[68] - University of California, Santa Cruz
```

### Finding a specific module
Look for modules that matches the user entered keyword.
* The output also consists of the index of the module, which is needed for subsequent commands.  
#### Format: `find /mod <KEYWORD>`
#### Example of usage:
* Input: `find /mod CS1010`  
Expected output:
```
[77] CS1010   : Programming Methodology
[78] CS1010E  : Programming Methodology
[79] CS1010J  : Programming Methodology
[80] CS1010S  : Programming Methodology
```

### Searching for available module mappings:
Displays all available module mappings for a specific university that matches the list of selected modules.
> Mappings here are labeled with a mapping index, which will be used for `add /map` and `remove /map` commands.
#### Format: `searchmap <UNIVERSITY_INDEX>`
#### Example of usage:
* Input: `searchmap 4`  
Expected Output:
```
Potential mappings for Boston University:
[1] CS1231 - MET CS 248 : Discrete Mathematics
[2] CS1231 - CAS CS131 : Combinatoric Structures
```

### Removing a selected university
Remove a partner university from the user selected university list.
#### Format: `remove /uni <UNIVERSITY_INDEX>` `remove /uni <UNIVERSITY_NAME` 
#### Examples of usage: 
* Input: `remove /uni 4` 
Expected output:
```
This university is removed: 
[4] - Boston University
```
* Input: `remove /uni Boston University`  
Expected output:
```
This university is removed: 
[4] - Boston University
```

### Removing a selected NUS module
Removes a module from the user selected module list.
#### Format: `remove /mod <MODULE_CODE>` `remove /mod <MODULE_INDEX>`
#### Examples of usage:
* Input: `remvoe /mod 81`  
  Expected output:
```
The following module has been removed: 
[81] CS1231 : Discrete Structures
```
* Input: `remove /mod CS1231`  
Expected output:
```
The following module has been removed: 
[81] CS1231 : Discrete Structures
```


### Removing a selected module mapping
Removes a module mapping under a selected university.
#### Format: `remove /map <UNIVERSITY_INDEX> <MAPPING_INDEX>`  
#### Example of usage: 
* Input: `remove /map 4 2`  
Expected output:  
```
The following module mapping has been removed:
[4] Boston University
CS1231 - CAS CS131 : Combinatoric Structures
```

## FAQ

**Q**: How do I transfer my data to another Computer?  
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that 
contains the data of your previous AddressBook home folder.


**Q**: How do I save my selected universities and modules?
**A**: All your universities, modules and module mappings are automatically saved at 
each command and will be auto-loaded on program start. 

## Command Summary

Command | Format | Purpose
--------|---------|-----------
`add` | `add /uni <UNI_INDEX>` `add /mod <MOD_INDEX>` `add /map <UNI_INDEX> <MAP_INDEX>` | Add a university/module/mapping
`remove` | `remove /uni <UNI_INDEX>` `remove /mod <MOD_INDEX>` `remove /map <UNI_INDEX> <MAP_INDEX>` | Remove a university/module/mapping
`list` | `list /muni` `list /mmod` `list /suni` `list /smod` | List master/selected university list or module list
`searchmap` | `searchmap <UNI_INDEX>`| Search for potential mappings for the selected university
`find` | `find /uni <KEYWORD>` `find /mod <KEYWORD>` | Find the possible university or module
`exit` | `exit` | Exit the application

## Glossary
1. `UNI_INDEX` - The unique identifier corresponding to a particular university.
2. `MOD_INDEX` - The unique identifier corresponding to a particular module.
3. `MAPPING_INDEX` - The identifier corresponding to a particular module mapping withing a university. Note: this value changes accordingly with the module selected list.
4. `university selected list` - 
5. `module selected list` -
6. 