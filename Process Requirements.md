
## Process Requirements

Contributing to, or starting, an open-source project means that there will be a wide range of developers from anywhere in the world that will be contributing to the codebase. Therefore, it is essential to have some sort of rules and requirements for the development process of open-source projects. Some essential requirements are listed below:

-   **Versioning and release management**: It is important to keep a track of the project versions. This is known as version control. Most of the open-source projects are hosted on GitHub, which offers solutions for version control. GitHub allows you to use an online platform to store your files so that you have an online backup of your work, which is beneficial for the collaborators. The commit-push-pull mantra of GitHub makes versioning possible and easy to manage.
-   **Open-source contribution requirements for developers**: Open-source projects have some contribution requirements and guidelines that the contributors must follow. These are important to streamline the open-source development process. I have discussed these in detail for every project below.
-   **Review Process**: Once the contributors have requested their changes, there must exist a proper review process through which the code gets accepted and merged into the codebase. I have discussed this below as well.
    
I have explored a number of open-source projects for process requirements. All of these are hosted on GitHub repositories and use `ReadMe.md` and similar files, which show version control and release management.

### Examples from an open-source project: ReactStoreFront

The ReactStoreFront code is present in a GitHub repository. The `ReadMe.md` file has a Development section that says that developers can ‘Raise an issue with a bug or feature request report, or just open a Pull Request with the proposed changes’. They also encourage joining the community slack channel. They also have a file `RSF BRANDGUIDE JPG.pdf` in their GitHub repository for developer guidelines. Other than that, they do not mention in the docs about the whole process for development or review.

>Reference: [https://docs.reactstorefront.io/guides/managing_state](https://docs.reactstorefront.io/guides/managing_state)
[https://github.com/storefront-foundation/react-storefront](https://github.com/storefront-foundation/react-storefront)

### Examples from an open-source project: Google Open-Source

Google has multiple open-source projects. The Google Open Source site has documentation that mentions in detail the whole process of creating, using and growing the codebase.

The first part is creating which covers how Googlers release code that they've written, either in the form of a new standalone project or as a patch to an external project. The documentation explains the whole release process in detail, including release guidelines, approval guidelines, preparation, and staging.

The documentation says that the review process typically takes under a week from filing to final approval, but it is best to start this process early if you have a strict deadline. It also mentions a few Frequently Asked Questions about the whole process and says that they are looking to automate the process since it is currently not very seamless.

Non-Google contributors also have to sign a Contribution License Agreement (CLA). Further, Google also has Peer Bonus, Student Programs, and similar activities to keep the contributors motivated.

>Reference: [https://opensource.google/documentation/reference](https://opensource.google/documentation/reference)

### Examples from an open-source project: Elastic Path ReactStoreFront

The Elastic Path storefront docs clearly mention the Requirements and Specifications needed for contribution. They specify that you need to know the following development tools:

-   Git
-   Node.js
-   Yarn
-   Visual Studio Code with the following extensions:
	-   Debugger for Chrome
	-   ESLint extension
    
And knowledge of the following technologies:

-   React
-   jQuery
-   Bootstrap
-   CSS
-   sass

>Reference: [https://documentation.elasticpath.com/storefront-react/docs/get-started/requirements.html](https://documentation.elasticpath.com/storefront-react/docs/get-started/requirements.html)
    
### Examples from an open-source project: Saleor

In its documentation, Saleor explains the process of contribution in detail. First, it talks about issues. For bugs, we are instructed to create GitHub issues using the Bug Report format provided. You can further specify in the issue’s comment if you want the team to fix it or want to contribute yourself.

For a new feature, before contribution, we have to first open a discussion or issue for it and let the team decide whether the new feature is suitable or not. Before merging a new feature, the team reviews the pull requests, which are reviewed on a daily basis or marked queued for review if it will take a longer period of time.

For ensuring version control, Poetry is used. They have mentioned in the docs that the project’s direct dependencies are stored in `pyproject.toml`. Running `poetry lock` generates `poetry.lock`, which has all versions pinned. They also recommend keeping `pyproject.toml` and `poetry.lock` under version control to ensure that all computers and environments run the same code. For compatibility, Saleor also provides `requirements.txt` and `requirements_dev.txt`. A `changelog` file is also maintained.

Further, they also mention coding conventions and using Linters (which are described in the architectural modularity requirements). Additionally, there is a great detail of all the guidelines available in their documentation.

>Reference: [https://docs.saleor.io/docs/3.x/developer/community/contributing](https://docs.saleor.io/docs/3.x/developer/community/contributing)

### Examples from an open-source project: React

The React docs have a whole section on guidelines for how to contribute. The docs start by mentioning a code of conduct that the developers and contributors must adhere to. For contributions, they use GitHub and both core team members and external contributors send pull requests which go through the same review process.

React follows semantic versioning. The versions are categorized into patch versions, minor versions, and major versions. A `changelog` file is also maintained for version control.

All the changes are submitted directly to the `main` branch. To keep the `main` branch in a releasable state, breaking changes and experimental features must be gated behind feature flags, which are defined in `packages/shared/ReactFeatureFlags.js`

For reporting bugs, GitHub issues are used. They also have discussion forums and Discord channels for the community. Contributors also have to sign the Contribution License Agreement (CLA). Further, there are some contribution prerequisites as well such as familiarity with Git, installation of JDK and `gcc`, etc. The whole process of pull requests and the development workflow have also been explained.
>Reference: https://reactjs.org/docs/how-to-contribute.html

> Note: All the open-source projects I have mentioned have extensive documentation, and it is not possible for me to describe all the details here. I have just summarized the main concepts to demonstrate my understanding. For detailed coding requirements, I have provided the links in the references.


