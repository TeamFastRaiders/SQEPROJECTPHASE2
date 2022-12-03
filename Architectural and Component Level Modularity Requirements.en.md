
## Architectural and Component Level Modularity Requirements

Modularity consists of breaking up your system’s architecture into components that can work on their own as well as bonded together with other components. Modularity assists us in minimizing the complexity of the software development process.

Modularity is essential for the success of any software application. However, for open-source projects, modularity is even more important because the code has to be easily understandable to a wider number of contributors.

Below are a few ways in which modularity is handled in open-source projects.

### Microservices

Microservices use the concept of modularity by decomposing the application into components that can each provide some *service*. This concept relies upon using APIs as end-points, such as a stateless REST API accessed over HTTP(S). Microservices use APIs to communicate and exchange data between applications.

For open source projects, microservices are popularly used for implementation of architectural requirements such as authentication, service discovery, logging and monitoring, load balancing, scaling, and several more.

> Note: The concept of microservices is similar to that of Service Oriented Architecture (SOA), which also focuses on breaking down your application’s architecture into components that provide a service.

Here is how microservices are used in some open source projects I have explored:

-   **Platform as a Service (PaaS)**: PaaS is a tool that lets developers choose open source components for particular parts of their own project by applying abstraction.
-   **API gateways**: Since microservices involve using APIs to run separate components, an API gateway is necessary which controls and manages API calls to the application. Example open source projects include 3scale, API Umbrella, and DreamFactory.
-   **CI/CD**: Continuous integration (CI) and continuous deployment (CD) assists your microservices implementation. Open source tools for CI/CD include GitLab and Jenkins.
-   **Containers**: Containers can essentially be said to be a way of implementing microservices, but I have made a separate section for them in detail below.
    
### Containers

Containers simplify the use of microservices by allowing the usage of lightweight and small components that can be shipped in a single container. Containers use the concept of modularity because they assist breaking down the application and storing it in different parts instead of having everything installed on one physical or virtual machine.

The most popular open source project for supporting containers is Docker. It works on the command line and is frequently used for Linux containers.

Having a large number of containers and managing their instances can be difficult. The solution to this is the use of container orchestrators. Examples of open source container orchestrators include Kubernetes and OpenShift.

### Modular Folder Structure

Folder structure is an important concept to ensure modularity for your open-source project. Your project code will lie in a repository that is to be accessed by multiple developers, therefore it is essential to structure and organize it in a way that is easy to understand and navigate.

In GitHub repositories, there are multiple ways to organize your project. I explored the monorepo organization, which is an approach that organizes related modules together. It is used by large projects like Babel. Using monorepo, it is easier to add modules as only one pull request is required, and there is no need to worry about backward compatibility as well. An example project is CleverBrush which uses this approach to bring together similar related modules such as utilities, UI, etc.

For folder structure, there are multiple options that you can implement to ensure modularity:

-   **Splitting into components**: This approach is suitable when developing a module that will integrate into your application. This means that the components that will make up the individual feature will be independent.
-   **Separation into entities**: This means organizing components as those belonging to the same type of entity such as containers, reducers, etc. This approach is found in many frameworks like AngularJS, Angular 2+, React, and various other programming languages, especially on the backend.
-   **Separation by features**: Separation by features refers to separating business logic from the presentation by bringing logic into independent and independent units known as features. An open-source project rockpack by AlexSurgey follows this approach (github link in references).
    
### Linters

A linter is a tool that analyzes your source code and improves code quality. Linters help improve the code quality by checking for syntax errors, code standards adherence, potential code problems and security checks. The ReactStoreFront is set up with a linter called ESLint. ESLint is a linting utility for JavaScript and JSX.

### Examples from an open source project: ReactStoreFront

ReactStorefront is a flexible e-commerce website built on the Elastic Path RESTful API known as Cortex API. I explored the Elastic Path documentation for the ReactStorefront and read about its architecture.

The storefront architecture is composed of containers called pages and components. Each page in the storefront is composed of various components that help perform the purpose of that particular page. For example, the storefront has a Home page that contains a set of components like navigation, product list, footer, etc.

Each component and page contains `{scss}` files that can be compiled into `style.css` files. The `{scss}` files for each component/page are organized in the same order as the storefront is presented. For example, `CartPage.scss` contains CSS for the cart’s container page, and `cart.main.scss` contains CSS for the main component in the cart page.

The storefront architecture is divided into 5 layers, which are:

-   **Presentation layer**: It provides the UI for the interaction with the user. The code of the presentation layer consists of the `index.html`, `App.tsx`, `index.tsx`, `routes.ts`, CSS and service worker files.
-   **Catalog and site images**: The images on the website’s catalog are externally hosted here.
-   **Page and component layer**: Pages and components have been explained above. This layer consists of their details.
-   **Web Server Layer**: this layer allows the interaction between the application and the service layer.
-   **API layer**: As discussed earlier, the storefront is built on Cortex API.
    
### Examples from an open-source project: OpenShift

OpenShift is a cloud-based Kubernetes container platform. The document for OpenShift mentions using architectural concepts to ensure modularity in the following features:

-   **Custom operating system**: OpenShift uses Fedora CoreOS (FCOS), which is a container-oriented operating system that is specifically designed for running containerized applications. It uses Ignition as a firstboot system configuration and Kubelet for managing containers.
-   **Operators**: The documentation mentions operators as the fundamental unit of the OpenShift code base.OpenShift uses operators such as the Cluster Version Operator and Machine Config Operator to manage critical components.
    

> References:
[https://opensource.com/resources/what-are-microservices](https://opensource.com/resources/what-are-microservices)
[https://opensource.com/article/19/11/microservices-cheat-sheet](https://opensource.com/article/19/11/microservices-cheat-sheet)
[https://opensource.com/resources/what-are-linux-containers](https://opensource.com/resources/what-are-linux-containers)
[https://www.okd.io/about/](https://www.okd.io/about/)
[https://docs.okd.io/latest/architecture/index.html](https://docs.okd.io/latest/architecture/index.html)
[https://github.com/AlexSergey/rockpack/tree/master/next/web-client/src](https://github.com/AlexSergey/rockpack/tree/master/next/web-client/src)
[https://dev.to/alexsergey/project-structure-repository-and-folders-review-of-approaches-4kh2](https://dev.to/alexsergey/project-structure-repository-and-folders-review-of-approaches-4kh2)
[https://documentation.elasticpath.com/storefront-react/docs/index.html](https://documentation.elasticpath.com/storefront-react/docs/index.html)
