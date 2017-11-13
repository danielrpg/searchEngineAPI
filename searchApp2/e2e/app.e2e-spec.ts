import { SearchApp2Page } from './app.po';

describe('search-app2 App', () => {
  let page: SearchApp2Page;

  beforeEach(() => {
    page = new SearchApp2Page();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
