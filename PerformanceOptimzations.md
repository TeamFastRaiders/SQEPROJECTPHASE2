# SQEPROJECTPHASE2
# PERFORMANCE OPTIMIZATIONS FOR ASSIGNMENT 3

Q : Explore and document different performance optimizations (e.g. Usage of Cache, Usage of Content Delivery Network, Usage of Lazy loading in web and asset workflows in games, Usage of PWA, Service workers and local storage)

What is Performance Optimization?
	
While studying data structures I always had to make a choice between time and space complexities. Performance Optimization can be described as the same process of choosing a trade off between some aspects of a software to make it compile and execute faster. During the construction phases it is one of the most important phases since prioritizing some aspects over others can majorly affect the performance of your software. This process is done by closely monitoring the performances of the software in various scenarios and after that an analysis is done which allows the quality engineers to choose between various aspects such memory usage, disk space , bandwidth and execution time.
	`


Core Principles of Software Peformance Optimization

Algorithmic Optimization :

To acheive better time and space complexities we should choose the best possible algorithms. Some optimal algorithms for Sorting are Bubble Sort, Insertion Sort , Merge Sort and Quick Sort. For Searching some optimal algorithms are Linear Search ,  Binary Search and Hashtable Lookup. These algorithms may not be the best in all scenarios but when combined with certain data structures these can produce exceptional results.

Removing Unneccesary Instructions :

Instead of using complex instructions in a single line , keep a variable that allows reusabilty and modularity. Heres an example of a bad code : name.substring(name.indexOf(“”) +1 , name.length());  Heres and example that code modified with a variable named space index : name.substring(spaceindex + 1 , name.length());

Hardware Align the Code :

Our code should be written with the knowledge of the hardware it is going to be executed on. This allows the instructions to fit the CPU instruction execution pipelines better to increase performance. Do instruction reordering , reducing branches , SIMD instructions and GPU instructions to reduce the load on CPU.

Data to CPU Proximity :

The closer the data is to the CPU the faster it is to process the data. This is why we have difference types of data cache layers both in the hardware and software.

Data Size :

Compressing the data , compacting the data formats and more compact data structures makes it easier to transport the data to the CPU.

Minimizing Overheads :

Those actions that require overheads should be carried out once in batch instead of executing those actions repeatedly . For example : Instead of closing the connection to the database after an instruction, close only after all the instructions have been executed.

Utilize the Idle Time :

When the CPU is not doing any processing and waiting for a response from an I/O or a server, the CPU is wasting its resources. Therefore, code should be done in such a way that the idle time is utilized and the CPU is always kept busy.

Parallelization :

Utilize multiple CPU’s/Computers and do work in parallel using Parallel workers, Assembly Line, Fork and Join, Map Reduce, and Single Threaded Concurrency.

External System Interaction :

We should make sure that our application is interacting with any external systems in the most optimal way. Example is using Query Optimization and Batch Operations if we are interacting with an SQL database.




Usage of Cache

Cache is used to store data temporarily using software or hardware and when that data is needed in a process it can be delivered much more quickly rather than fetching it from storage and increasing the overhead. Cache is an even faster storage mechanism than RAM. For usage of cache I explored the open source project : JAVA CACHING SYSTEM

Enterprise Java specialist Steve Haines joins the Open source Java projects series this month with an introduction to Java Caching System (JCS), a robust enterprise-level caching solution. Steve starts with a quick introduction to caching, discussing the criteria for determining if objects should be cached and whether your application would benefit from a cache. He then shows you how to configure JCS and use it to build a caching application.
The Java Caching System (JCS) is a robust open source caching product released through the Apache Jakarta subproject. It provides the standard features that you would expect of a cache system, such as in-memory caching and algorithms for selectively removing objects from the cache. It also offers more-advanced features, such as indexed disk caching and support for distributed caches.
A JCS cache has a map-like structure in which data is stored in the cache as a name-and-value pair. JCS partitions the cache into regions. Each region has its own configuration as well as its own set of name-value pairs. Each region can:
 
Be sized differently
Be implemented differently
Contain different data
The keys (the names in the name-and-value pairs) in one region can be the same as keys in other regions. This is important because it enables you to maintain separate caches for different objects all within the same JVM -- and all defined in a single properties file.

Usage of Content Delivery Network

Content delivery Networks are used for efficient and secure delivery of content. The servers are distributed over various areas/countries, this allows the loading of content such as images,videos,HTML Pages and JavaScript files faster since we do not have to rely on servers which are residing far from our IP, instead we rely on the servers nearest to us. They help utilize caching and reduce bandwidth which prevent interruptions in service and improve security.Website load times are also reduced.It also reduces amount of data by compression. Load Balancing is also used which distributes traffic evenly. CDN Servers are linked together by placing servers at Internet Exchange Points. Moreover, CDNs place Data Centers at strategic locations across the globe, enhance security, and are designed to survive various types of failures and Internet congestion. Open source project i explored is : Transformings . Transformings is an Open Source Image CDN that provides image transformation API and supports the latest image formats, such as WebP, AVIF and network client hints. 
The API has 4 HTTP endpoints:

/img/{IMG_URL}/optimise - optimises image
/img/{IMG_URL}/resize - resizes image
/img/{IMG_URL}/fit - resize image to the exact size by resizing and cropping it
/img/{IMG_URL}/asis - returns original image

 Usage of Lazy Loading in Web
To reduce long loading times the concept of lazy loading in web was introduced. Lazy loading identifies which resources are non-critical at the time and stops their loading, when the resource is actually needed then that resource is fetched and loaded which reduces load times.Lazy Loading shortens the critical rendering path , for example if we are using daraz and we are not scrolling down then the images of items wont be preloaded, they will only when we scroll down. 
Lazy loading can be implemented in JavaScript,CSS and HTML using code splitting , which splits the code into smaller chunks and provides minimal code to load the page, which reduces the load times.

Lazy loading can be used for images and iframes using the code snippet below :
<img src="image.jpg" alt="..." loading="lazy" />
<iframe src="video-player.html" title="..." loading="lazy"></iframe>

Lazy loading in fonts can be used by the following the code :
<link rel="preload">

An open source project I explored for Lazy Loading was Cloudinary.  It is a cloud based service that automates the process of lazy loading. Heres the react code snippet that Cloudinary uses for Lazy Loading :
mport React, { Suspense } from 'react';

const OtherComponent = React.lazy(() => import('./OtherComponent'));

function MyComponent() {
 return (
  <div>
   <Suspense fallback={<div>Loading...</div>}>
    <OtherComponent />
   </Suspense>
  </div>
 );
}



Asset Workflows in Games

In game development asset can refer to a character, a game object such as a wall , sound, animation or even textures. Various tools are used in an asset workflow such as Autodesk MAYA, Blender etc. For effective management Game Asset Management Sotware is used to organize assets for reuse in order to lower costs and time usage. Just like an architect constructs a house, game asset workflows start from a concept which can be handdrawn roughly , after the concept has been approved , the process of sculpting which means actually transforming the concept into a model begins, for this softwares such as Blender are used to create a polygon mesh. After this the process of UV Mapping and baking and texturing is done which is basically the process of adding details and color to the sculpture created in blender.Once all the mappings have been done some companies also add lighting and then finally the asset is added to the teams library for use. As we can see this process is time taking and Review process can take long, along with that the assets can be stolen or leaked such as the assets of GTA 6 were leaked recently , therefore to solve all these problems , i explored an open source project : Helix Dam. It is an asset management software that has the ability to manage the large, complex binary files with the speed teams need.  
Helix DAM builds on Perforce’s industry-leading version control tool and makes versioning simple for designers and artists. It allows creative teams to:
Easily store, find, use, and share all art assets.
Track the evolution of every art asset & find the version they need.
Provide in-context feedback on assets for a faster review & revision process.
Streamline the creative workflow and eliminate bottlenecks.
Keep all creative IP in one secure, single source of truth.

Usage of PWA

Progressive Web Apps is a blend of website and native apps. They are type of special web applications that can be visited like normal websites however they offer added benefits such as usability , push notifications, and access to device hardware which traditional websites couldnt do. PWA can give more engaging and reliable interface and delivery of our website and ecommerce store. Loading times are reduced critically and they can even browse sites while being offline, once the user comes back online, the data is updated accordingly.

For website or eCommerce store owners, the advantages of web apps include:
Increased conversion rates
Increased user time on your site
Improved user experience
Increased organic search traffic
PWAs are usually more affordable to create and maintain than native apps
Your most loyal customers can save your app on their home screen
All of the above results in overall higher levels of performance and customer engagement, which leads to increased revenue
For users, the advantages of web apps include:
PWAs are faster, loading in an instant
You can browse the website while being offline
Better, smoother experience
PWAs use less data
One-click access (save as an icon on your phone home screen)
An open source project i explored for PWA was Ionic. Ionic offers 2 benefits for creating a PWA.The first is direct control of the code you are working with. App developers usually have only a limited amount of power over a website. While most of the control is out of the developer's hands, there are some places where you can exert some control, for example, during deployment or displaying pages. Progressive websites give you some of that control back.The second benefit is increased control over the content. When developing progressive websites, you can use Ionic's UI components to add extra features to a website. This makes the code more flexible and enables you to create more immersive experiences.
Service Workers

Service Workers is an extra layer added between web apps, browser and network. They are used for better offline experiences, intercepting network requests and deciding the actions to take when the network is available, also they update assets residing on the server. Service worker is an event-driven worker registered against an origin and a path. It takes the form of a JavaScript file that can control the web-page/site that it is associated with, intercepting and modifying navigation and resource requests, and caching resources in a very granular fashion to give you complete control over how your app behaves in certain situations.Service workers also have scriptable caches. Along with the ability to respond to network requests from certain web pages via script, this provides a way for applications to “go offline”. The open source project i explored was w2c’s Service Worker.
	
Local Storage

Local Storage is the concept of storing data locally within the users browser. Before this concept there was concept of cookies which had to be included in every server request. However, web storage is more secure ad large amounts of data can be stored locally without hindering performance. An example of using local storage is provided in the code snippet below :
// Store
localStorage.lastname = "Smith";
// Retrieve
document.getElementById("result").innerHTML = localStorage.lastname;
// Remove
localStorage.removeItem("lastname");

An open source project i explored was FireFox which supports local storage.


