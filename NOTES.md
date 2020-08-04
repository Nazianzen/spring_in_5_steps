## Questions to ask to optimize use of Spring

- What are the beans?
- What are the dependencies for a bean?
- Where to search for beans?
 
## Where to choose between constructor and setter injection
- There is really no defined choice pattern between these two now, but traditionally:
  - **Mandatory** dependencies should use **constructor injection**
  - **Optional** dependencies should use **setter injection**'

