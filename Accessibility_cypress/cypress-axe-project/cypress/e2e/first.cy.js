///<reference types="cypress"/>

describe('Todo application', () => {

  beforeEach(() => {
    cy.visit('http://todomvc.com/examples/react');
    cy.injectAxe();
  });

  it('should log any accessibility faliures', () => {
    cy.checkA11y();
  });

  it('should exclude specific elements on the page', () => {
    cy.checkA11y({ exclude: ['.learn'] });
  });

  it('should only test specific element on the page', () => {
    cy.checkA11y('.learn');
  });
/*For the first parameter, I'm going to pass null because we're not going to exclude any specific elements on the page.
Then for the second parameter, I'm going to pass our options object here.
Cypress-Axe has an option to set the includedImpacts, which accepts an array of strings that maps to a level of severity.
For this test let's only include the serious and critical impact.
*/
  it('should only include rules with serious and critical impacts', () => {

    cy.checkA11y(null, { includedImpacts: ['critical', 'serious'] });
 
  });
  
  //how to exclude the specific rules regardless of its impact.
  // I'm just going to disable the color-contrast, and then let's go ahead and add an only keyword here, so our test runner only picks up this test.
  it('should exclude specific accessibility rules', () => {
    cy.checkA11y(null, {
      rules: {
        'color-contrast': { enabled: false },
      },
    });
  });

});