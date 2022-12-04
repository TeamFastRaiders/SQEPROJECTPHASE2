# SQEPROJECTPHASE2
# SECURITY REQUIREMENTS FOR ASSIGNMENT 3

Q-3 Explore and document different security requirements (e.g. Secrets management,
       Application Firewalls, SAST, In-built security, security standard compliances, etc)

What are Security Requirements

Security Requirements are considered as non-functional requirements in Software Engineering. It contains requirements such as safety from malicious attacks and prevention of vulnerabilites. They are derived from Industry Standards , applicable laws, and history of past vulnerabilities.
Successful use of security requirements involves four steps. The process includes discovering / selecting, documenting, implementing, and then confirming correct implementation of new security features and functionality within an application.

Secrets Management

These are tools and methods for managing important credentials like passwords and tokens for use in applications,services and privileged accounts.Secrets management is important because user data has to be transmitted securely and since the chances of attacks have risen exponentially in the recent years. Secrets include :
User or auto-generated passwords
API and other application keys/credentials (including within containers)
SSH Keys
Database and other system-to-system passwords.
Private certificates for secure communication, transmitting and receiving of data (TLS, SSL etc.)
Private encryption keys for systems like PGP
RSA and other one-time password devices
The Best way to do Secrets Management is by :
Discover/identify all types of passwords: Keys and other secrets across your entire IT environment and bring them under centralized management. Continuously discover and onboard new secrets as they are created.
Eliminate hardcoded/embedded secrets: In DevOps tool configurations, build scripts, code files, test builds, production builds, applications, and more. Bring hardcoded credentials under management, such as by using API calls, and enforce password security best practices. Eliminating hardcoded and default passwords effectively removes dangerous backdoors to your environment.
Enforce password security best practices: Including password length, complexity, uniqueness expiration, rotation, and more across all types of passwords. Secrets, if possible, should never be shared. If a secret is shared, it should be immediately changed. Secrets to more sensitive tools and systems should have more rigorous security parameters, such as one-time passwords, and rotation after each use.
Apply privileged session monitoring to log, audit, and monitor: All privileged sessions (for accounts, users, scripts, automation tools, etc.) to improve oversight and accountability. This can also entail capturing keystrokes and screens (allowing for live view and playback). Some enterprise privilege session management solutions also enable IT teams to pinpoint suspicious session activity in-progress, and pause, lock, or terminate the session until the activity can be adequately evaluated.
Extend secrets management to third-parties: Ensure partners and vendors conform to best practices in using and managing secrets.
Threat analytics: Continuously analyze secrets usage to detect anomalies and potential threats. The more integrated and centralized your secrets management, the better you will be able to report on accounts, keys applications, containers, and systems exposed to risk.
DevSecOps: With the speed and scale of DevOps, it’s crucial to build security into both the culture and the DevOps lifecycle (from inception, design, build, test, release, support, maintenance). Embracing a DevSecOps culture means that everyone shares responsibility for DevOps security, helping ensure accountability and alignment across teams. In practice, this should entail ensuring secrets management best practices are in place and that code does not contain embedded passwords in it
The Open source project i explored for Secrets Management is : AWS Secrets Manager. Secrets Manager enables you to manage access to secrets using fine-grained permissions. The key features of AWS Secrets Manager are:
Encrypts secrets at rest using encryption keys.
Also, it decrypts the secret, and then it transmits securely over TLS.
Provides code samples that help to call Secrets Manager APIs
It has client-side caching libraries to improve the availability and reduce the latency of using your secrets.
Configure Amazon VPC (Virtual Private Cloud) endpoints to keep traffic within the AWS network.
 
3) Application Firewalls
These are types of firewalls that are given instructions and these instructions determine whether to allow or block communication from an application/service.There are two types of application firewalls, active and passive. Active Firewalls actively inspect all incoming requests including the actual message being exchanged against known vulnerabilities such as SQL injections, parameter and cookie tampering, and cross-site scripting. Only requests deemed “clean” are passed to the application.Passive Firwalls act in a similar way to an intrusion detection system (IDS) in that they also inspect all incoming requests against known vulnerabilities, but they don’t actively reject or deny those requests if a potential attack is discovered.Application firewalls are generally remotely updateable, which allows them to prevent newly discovered vulnerabilities. They’re often more up to date than specific security-focused code included in applications, due to the longer development and testing cycles required to include such code within applications.Today, you’ll most commonly see web application firewalls (WAFs) to filter, monitor, and block HTTP/S traffic to and from a web application, specifically. Application firewalls offer several benefits such as Cost Benefits, No Vendor Lock-in, Developer Community Support. However they have some disadvantages as well. These are Distributed Attacks, Can be Bypassed,Zero Day Vulnerabilities and Configuration and Maintenance issues. The open source project regarding Application Firewall i explored was NAXSI. Naxsi may examine many data, including URLs, request parameters, cookies, headers, and the POST body, and it can be enabled or disabled at the location level in the Nginx configuration. Automatic whitelist generation simplifies upstream firewall deployment and eliminates any false positives. Other applications, such as NX-Utils and Doxi, simplify administration, report production, and ruleset modifications.NX-utils, which are included with Naxsi, are highly useful for producing whitelists and reports. First, the NX-utils collection consists of intercept mode, which enables Naxsi to record requests stopped by the WAF for future reports and whitelists in a database, and report mode, which visualizes the saved events. A future version of NX-Utils will enable enhanced report processing and filtering in order to evaluate WAF events with greater precision.
 
 4) SAST
SAST means static application security testing.It is a method to analyze source code and identifying security vulnerabilities which might make our application vulnerable to attacks.SAST comes under the umbrella of White Box Texting and it scans the code before the code is compiled.It helps developers identify vulnerabilities in the initial stages of development and quickly resolve issues without breaking builds or passing on vulnerabilities to the final release of the application.SAST tools give developers real-time feedback as they code, helping them fix issues before they pass the code to the next phase of the SDLC. This prevents security-related issues from being considered an afterthought. SAST tools also provide graphical representations of the issues found, from source to sink. These help you navigate the code easier. Some tools point out the exact location of vulnerabilities and highlight the risky code. Tools can also provide in-depth guidance on how to fix issues and the best place in the code to fix them, without requiring deep security domain expertise.Developers can also create the customized reports they need with SAST tools; these reports can be exported offline and tracked using dashboards. Tracking all the security issues reported by the tool in an organized way can help developers remediate these issues promptly and release applications with minimal problems. This process contributes to the creation of a secure SDLC.It’s important to note that SAST tools must be run on the application on a regular basis, such as during daily/monthly builds, every time code is checked in, or during a code release.Here are the benefits of SAST :
The analysis can find major vulnerabilities like buffer overflow, SQL Injection flaws, XSS, and so forth. 
It can detect highly complex flaws that are not visible without access to the source code.  
It results in highlight precise source files and line numbers that are affected. 
It provides a valuable framework during development to detect flaws before they become security risks for your end users and your organization. 
It can be easily integrated with IDEs. (Integrated Development Environments) 
An open source project I explored regarding SAST was Code Warrior. It supports C, C#, PHP, Java, Ruby, ASP and JavaScript. The tool doesn’t need to be installed on a machine. Compiling it using “make” is enough to run this tool after downloading. It is available for Linux, BSD and MacOS systems. Although it is a web application, it does not require Apache. Once you run the scanner, it opens up the web browser and prompts you to select the source code. As compared to other tools, it has a relatively low rate of false positives. 

5) Security Standard Compliances
These enable developers/organisations to have a single unified language/set of instructions that must be followed in order to achieve maximum possible security.Organizations must conform to specific set of laws, regulations, rules, or standards. Compliance is critical for trust, reputation, security, and data integrity, which all ultimately affect the bottom line. The goal is to comply with industry standards, regulatory requirements, security policies, and corporate interests. Some common compliance obligations are  :
European General Data Protection Act (GDPR)
Sarbanes-Oxley Act (SOX)
Gramm-Leach-Bliley Act
Health Insurance Portability and Accountability Act (HIPAA)
Payment Card Industry Data Security Standard (PCI-DSS)
Some challenges faced during compliance management are Changing Security Landscape and new Regulations along with distributed environments across many platforms. Moreover it is a manual time taking process and organizations often have multi country presence. Lastly it is difficult to coordinate with large teams.
In order to effectively manage compliance management we should have a compliance program, promote communication,Automate Controls, Perform consistent patch testing,Continous Monitoring,and Connect your tools.
An open source project i explored with Security Compliance was Ignyte which is a GDPR system used by many companies across various sectors of the market including military, intelligence, DoD of the federal government, and many medical-healthcare industries in a user-friendly manner. It has also proven to be a risk free management system that works in compliance with law and order.
Key Features:
It allows you to handle classified information by exploring new solutions for the Defense industrial base, complying entirely with NIST, DFARS, and CMMC regulations to protect your data.
As a part of the healthcare management system, you can manage sensitive patient data by making use of its automated HIPAA and HITRUST solutions that make use of spreadsheets, checklists, and manual evidence collection.
 
