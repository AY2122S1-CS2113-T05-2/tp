# Developer Guide

## Contents 
* __Acknowledgements__
* __Getting Started__
* __Design & Implementation__
* __Product Scope__
  1. Target user profile
  2. Value proposition
* __User Stories__
* __Non-Functional Requirements__
* __Glossary__
* __Instructions for manual testing__ 
## Acknowledgements

* __EduRec:__ For the list of possible module mappings

## Getting started 
Refer to our user guide [here](https://github.com/AY2122S1-CS2113T-T09-2/tp/blob/master/docs/UserGuide.md)

## Design & implementation

<img src="images/Placeholder_person.png" width = "280"/>  

The ***Architecture Diagram*** above explains the high-level design of the App. 

### Ui
The Ui component consolidates and formats the output of the program before displaying it to the user
in the command line. 

The UI component 
* Displays different object types such as University, Module and Module mapping.
* Provides means of customization for display formatting. 
* Summarizes different parts of the program into callable methods. 

### Storage

The storage component can implement the below features:

* Read the list of module mappings offered by each university from the CSV file.
* Read the list of NUS modules which can be mapped from the CSV file.
* Save both user's module mappings for each university and their selected NUS modules in text
  file and read them back into corresponding objects.

## Product scope
### Target user profile

__SEPlanner__ is targeted at Computer Engineering students in NUS planning for their Student Exchange Program (SEP). 

### Value proposition

Student Exchange Program is one of the most stressful and difficult things to plan for in a NUS students life. 
With multiple sources of information and a frustrating webpage to navigate, SEPlanner aims to organise 
a list of potential exchange Universities based on the users study plan, module requirements and personal preference.

## User Stories

|Version| As a ... | I want to ... | So that I can ...|
|--------|----------|---------------|------------------|
|v1.0|new user|see the list of possible schools for exchange|view my options for SEP|
|v1.0|new user|see the list of available NUS modules|decide on which NUS modules I want to complete during SEP|
|v1.0|beginner user|add a University to my preferred list|view the Universities that I am interested in|
|v1.0|beginner user|add a NUS Module to my preferred list|save my module preferences for the future|
|v1.0|beginner user|list down all Universities in my preferred list|keep track of my target schools for SEP|
|v1.0|beginner user|list down all NUS modules in my preferred list|keep track of the list of NUS modules I want to complete during SEP|
|v1.0|beginner user|delete a University from the selected list|remove the University that I am not interested in|
|v1.0|beginner user|delete a module from the selected list|remove the module that I do not consider to enrol in the future|
|v1.0|user|interact with the application on the command line in an efficient way|
|v2.0|familiar user|save my university and module information|maintain access to my information when I restart the application|
|v2.0|new user|view the program instructions|refer to them when I forget how to use the application|
|v2.0|familiar user|find a University by name|locate a University without having to go through the entire list|
|v2.0|familiar user|search the available module mappings for a University based on the selected module list|get a list of module mappings for this university based on my selected modules|
|v2.0|familiar user|add a pair of module mapping for a university|save a module mapping under the university that I selected|
|v2.0|familiar user|delete a mapping pair of module for a university|remove a module mapping under a selected university|
|v2.0|familiar user|pass in University as command argument using its index in the master list|access the exact University I want without having to type out its full name and facing bugs caused by typo|

## Non-Functional Requirements

{Give non-functional requirements}

## Glossary

* *glossary item* - Definition
* *Master University List* The list of all partner universities.
* *Master Module List* - The list of all NUS modules available for mapping.
* *Selected University List* - The list of partner universities the user selected.
* *Selected Module List* - The list of modules the user selected.

## Instructions for manual testing

{Give instructions on how to do a manual product testing e.g., how to load sample data to be used for testing}
